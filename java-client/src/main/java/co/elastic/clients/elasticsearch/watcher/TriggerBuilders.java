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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Builders for {@link Trigger} variants.
 */
public class TriggerBuilders {
	private TriggerBuilders() {
	}

	/**
	 * Creates a builder for the {@link Schedule schedule} {@code Trigger} variant.
	 */
	public static Schedule.Builder schedule() {
		return new Schedule.Builder();
	}

	/**
	 * Creates a Trigger of the {@link Schedule schedule} {@code Trigger} variant.
	 */
	public static Trigger schedule(Function<Schedule.Builder, ObjectBuilder<Schedule>> fn) {
		Trigger.Builder builder = new Trigger.Builder();
		builder.schedule(fn.apply(new Schedule.Builder()).build());
		return builder.build();
	}

}
