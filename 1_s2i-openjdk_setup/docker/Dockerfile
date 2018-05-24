# openjdk-centos7
FROM openshift/base-centos7

MAINTAINER Christian Sanabria <christian.sanabria@ipt.ch>

LABEL io.k8s.description="Platform for building Java applications" \
      io.k8s.display-name="OpenJDK 1.8.0" \
      io.openshift.expose-services="8080:http" \
      io.openshift.tags="OpenJDK,1.8.0"

# Install ansible
RUN yum install epel-release -y && \
	yum install ansible -y && \
	yum clean all -y && \
	mkdir -p /etc/ansible && \
	echo 'localhost ansible_connection=local' > /etc/ansible/hosts

# Copy playbook
COPY ./playbooks/openjdk.yml /tmp/openjdk.yml

# Run the playbook
RUN ansible-playbook /tmp/openjdk.yml

# Copy default scripts
COPY ./s2i/bin/ /usr/libexec/s2i

# Drop the root user and make the content of /opt/app-root owned by user 1001
RUN chown -R 1001:1001 /opt/app-root && \
  chown -R 1001:1001 /usr/libexec/s2i && \
  chmod -R uga+rwx /usr/libexec/s2i && \
	chmod -R 777 /tmp

# Set default user
USER 1001

# Expose default port
EXPOSE 8080

# Run default command
CMD ["usage"]
