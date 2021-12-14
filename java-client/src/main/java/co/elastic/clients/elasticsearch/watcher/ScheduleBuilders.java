/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.Time;

/**
 * Builders for {@link Schedule} variants.
 * <p>
 * Variants <code>cron</code>, <code>monthly</code>, <code>weekly</code>,
 * <code>yearly</code> are not available here as they don't have a dedicated
 * class. Use {@link Schedule}'s builder for these.
 * 
 */
public class ScheduleBuilders {
	private ScheduleBuilders() {
	}

	/**
	 * Creates a builder for the {@link DailySchedule daily} {@code Schedule}
	 * variant.
	 */
	public static DailySchedule.Builder daily() {
		return new DailySchedule.Builder();
	}

	/**
	 * Creates a builder for the {@link HourlySchedule hourly} {@code Schedule}
	 * variant.
	 */
	public static HourlySchedule.Builder hourly() {
		return new HourlySchedule.Builder();
	}

	/**
	 * Creates a builder for the {@link Time interval} {@code Schedule} variant.
	 */
	public static Time.Builder interval() {
		return new Time.Builder();
	}

}
