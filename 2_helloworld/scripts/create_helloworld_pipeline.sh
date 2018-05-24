#! /bin/bash

oc project cicd

oc apply -f ../openshift/pipeline.yml
