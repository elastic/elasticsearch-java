#
# Licensed to Elasticsearch B.V. under one or more contributor
# license agreements. See the NOTICE file distributed with
# this work for additional information regarding copyright
# ownership. Elasticsearch B.V. licenses this file to you under
# the Apache License, Version 2.0 (the "License"); you may
# not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
#

# Build a Docker image that has Gradle and all project dependencies ready.
# Needs to be run with .git and java-client/src mounted under /elasticsearch-java.

FROM openjdk:15

# Default UID/GID to 1000
# it can be overridden at build time
ARG BUILDER_UID=1000
ARG BUILDER_GID=1000

# Create group and user if needed
RUN (getent group ${BUILDER_GID} || groupadd -g ${BUILDER_GID} elastic) \
    && (getent passwd ${BUILDER_UID} || useradd -u ${BUILDER_UID} -g ${BUILDER_GID} elastic) \
    && mkdir -p /elasticsearch-java/build \
    && chown -R ${BUILDER_UID}:${BUILDER_GID} /elasticsearch-java

WORKDIR /elasticsearch-java/
USER ${BUILDER_UID}:${BUILDER_GID}

# Download and initialize Gradle
COPY --chown=$BUILDER_UID:$BUILDER_GID gradlew ./
COPY --chown=$BUILDER_UID:$BUILDER_GID gradle ./gradle
RUN ./gradlew

COPY --chown=$BUILDER_UID:$BUILDER_GID LICENSE.txt NOTICE.txt ./

# Prefetch and cache dependencies
COPY --chown=$BUILDER_UID:$BUILDER_GID build.gradle.kts settings.gradle.kts ./
COPY --chown=$BUILDER_UID:$BUILDER_GID buildSrc ./buildSrc/
COPY --chown=$BUILDER_UID:$BUILDER_GID config ./config/
COPY --chown=$BUILDER_UID:$BUILDER_GID java-client/build.gradle.kts ./java-client/
RUN ./gradlew resolveDependencies

# Build artifacts. Expects these mounted directories:
# /elasticsearch-java/.git - git index (read-only)
# /elasticsearch-java/java-client/src - source files (read-only)
# /elasticsearch-java/build - output directory (read-write)
ENTRYPOINT ["./gradlew"]
