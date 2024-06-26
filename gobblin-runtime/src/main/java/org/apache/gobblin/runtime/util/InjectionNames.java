/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.gobblin.runtime.util;

/**
 * These names are used for dependency injection, when we need to inject different instances of the same type,
 * or inject constants.
 * */
public final class InjectionNames {
  public static final String SERVICE_NAME = "serviceName";
  public static final String FORCE_LEADER = "forceLeader";
  public static final String FLOW_CATALOG_LOCAL_COMMIT = "flowCatalogLocalCommit";

  // TODO: Rename `warm_standby_enabled` config to `message_forwarding_enabled` since it's a misnomer.
  public static final String WARM_STANDBY_ENABLED = "statelessRestAPIEnabled";
  public static final String MULTI_ACTIVE_SCHEDULER_ENABLED = "multiActiveSchedulerEnabled";
}
