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
ENV BUILDER_USER elastic
ENV BUILDER_GROUP elastic

# Create user
RUN groupadd --system -g ${BUILDER_GID} ${BUILDER_GROUP} \
    && useradd --system --shell /bin/bash -u ${BUILDER_UID} -g ${BUILDER_GROUP} -d /var/lib/elastic -m elastic 1>/dev/null 2>/dev/null \
    && mkdir -p /elasticsearch-java && mkdir /elasticsearch-java/build \
    && chown -R ${BUILDER_USER}:${BUILDER_GROUP} /elasticsearch-java

WORKDIR /elasticsearch-java/
USER ${BUILDER_USER}:${BUILDER_GROUP}

# Download and initialize Gradle
COPY --chown=$BUILDER_USER:$BUILDER_GROUP gradlew ./
COPY --chown=$BUILDER_USER:$BUILDER_GROUP gradle ./gradle
RUN ./gradlew

COPY LICENSE.txt NOTICE.txt ./

# Prefetch dependencies
COPY --chown=$BUILDER_USER:$BUILDER_GROUP build.gradle.kts settings.gradle.kts ./
COPY --chown=$BUILDER_USER:$BUILDER_GROUP buildSrc ./buildSrc/
COPY --chown=$BUILDER_USER:$BUILDER_GROUP config ./config/
COPY --chown=$BUILDER_USER:$BUILDER_GROUP java-client/build.gradle.kts ./java-client/
RUN ./gradlew resolveDependencies

ENTRYPOINT ["./gradlew"]
