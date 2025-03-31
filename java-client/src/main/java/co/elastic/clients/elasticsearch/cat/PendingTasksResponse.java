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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.pending_tasks.PendingTasksRecord;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: cat.pending_tasks.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.pending_tasks.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PendingTasksResponse implements JsonpSerializable {
	private final List<PendingTasksRecord> pendingTasks;

	// ---------------------------------------------------------------------------------------------

	private PendingTasksResponse(Builder builder) {

		this.pendingTasks = ApiTypeHelper.unmodifiableRequired(builder.pendingTasks, this, "pendingTasks");

	}

	public static PendingTasksResponse of(Function<Builder, ObjectBuilder<PendingTasksResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<PendingTasksRecord> pendingTasks() {
		return this.pendingTasks;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (PendingTasksRecord item0 : this.pendingTasks) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PendingTasksResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PendingTasksResponse> {
		private List<PendingTasksRecord> pendingTasks;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>pendingTasks</code>.
		 */
		public final Builder pendingTasks(List<PendingTasksRecord> list) {
			this.pendingTasks = _listAddAll(this.pendingTasks, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>pendingTasks</code>.
		 */
		public final Builder pendingTasks(PendingTasksRecord value, PendingTasksRecord... values) {
			this.pendingTasks = _listAdd(this.pendingTasks, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>pendingTasks</code> using a builder lambda.
		 */
		public final Builder pendingTasks(Function<PendingTasksRecord.Builder, ObjectBuilder<PendingTasksRecord>> fn) {
			return pendingTasks(fn.apply(new PendingTasksRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<PendingTasksRecord> value = (List<PendingTasksRecord>) JsonpDeserializer
					.arrayDeserializer(PendingTasksRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.pendingTasks(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PendingTasksResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PendingTasksResponse build() {
			_checkSingleUse();

			return new PendingTasksResponse(this);
		}
	}

	public static final JsonpDeserializer<PendingTasksResponse> _DESERIALIZER = createPendingTasksResponseDeserializer();
	protected static JsonpDeserializer<PendingTasksResponse> createPendingTasksResponseDeserializer() {

		JsonpDeserializer<List<PendingTasksRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(PendingTasksRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.pendingTasks(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
