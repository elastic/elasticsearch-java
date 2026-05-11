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

package co.elastic.clients.elasticsearch.indices.forcemerge;

import co.elastic.clients.elasticsearch._types.ShardsOperationResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

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

// typedef: indices.forcemerge._types.ForceMergeResponseBody

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.forcemerge._types.ForceMergeResponseBody">API
 *      specification</a>
 */

public abstract class ForceMergeResponseBody extends ShardsOperationResponseBase {
	@Nullable
	private final String task;

	// ---------------------------------------------------------------------------------------------

	protected ForceMergeResponseBody(AbstractBuilder<?> builder) {
		super(builder);

		this.task = builder.task;

	}

	/**
	 * task contains a task id returned when wait_for_completion=false, you can use
	 * the task_id to get the status of the task at _tasks/&lt;task_id&gt;
	 * <p>
	 * API name: {@code task}
	 */
	@Nullable
	public final String task() {
		return this.task;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.task != null) {
			generator.writeKey("task");
			generator.write(this.task);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ShardsOperationResponseBase.AbstractBuilder<BuilderT> {
		@Nullable
		private String task;

		/**
		 * task contains a task id returned when wait_for_completion=false, you can use
		 * the task_id to get the status of the task at _tasks/&lt;task_id&gt;
		 * <p>
		 * API name: {@code task}
		 */
		public final BuilderT task(@Nullable String value) {
			this.task = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupForceMergeResponseBodyDeserializer(
			ObjectDeserializer<BuilderT> op) {
		ShardsOperationResponseBase.setupShardsOperationResponseBaseDeserializer(op);
		op.add(AbstractBuilder::task, JsonpDeserializer.stringDeserializer(), "task");

	}

}
