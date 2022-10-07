#!/bin/bash
export MAVEN_OPTS="-Xms1024m -Xmx2048m"
mvn clean install org.pitest:pitest-maven:mutationCoverage
open target/pit-reports/index.html