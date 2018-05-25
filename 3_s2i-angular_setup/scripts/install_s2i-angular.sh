#! /bin/bash

oc create imagestream s2i-angular

oc apply -f ../openshift/buildconfig.yml

oc start-build s2i-angular --wait
