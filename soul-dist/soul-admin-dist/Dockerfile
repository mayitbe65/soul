# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

FROM java:openjdk-8-jre-alpine

ARG APP_NAME
ENV SPRING_PROFILES_ACTIVE h2
ENV LOCAL_PATH /opt/soul-admin

ADD target/${APP_NAME}.tar.gz /opt
RUN mv /opt/${APP_NAME} ${LOCAL_PATH}

EXPOSE 9095
ENTRYPOINT /bin/sh ${LOCAL_PATH}/bin/start.sh && tail -f ${LOCAL_PATH}/logs/soul-admin.out
