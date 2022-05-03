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

package co.elastic.clients.elasticsearch.slm;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm.execute_lifecycle.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm.execute_lifecycle.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecuteLifecycleResponse implements JsonpSerializable {
	private final String snapshotName;

	// ---------------------------------------------------------------------------------------------

	private ExecuteLifecycleResponse(Builder builder) {

		this.snapshotName = ApiTypeHelper.requireNonNull(builder.snapshotName, this, "snapshotName");

	}

	public static ExecuteLifecycleResponse of(Function<Builder, ObjectBuilder<ExecuteLifecycleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code snapshot_name}
	 */
	public final String snapshotName() {
		return this.snapshotName;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("snapshot_name");
		generator.write(this.snapshotName);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteLifecycleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecuteLifecycleResponse> {
		private String snapshotName;

		/**
		 * Required - API name: {@code snapshot_name}
		 */
		public final Builder snapshotName(String value) {
			this.snapshotName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecuteLifecycleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteLifecycleResponse build() {
			_checkSingleUse();

			return new ExecuteLifecycleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecuteLifecycleResponse}
	 */
	public static final JsonpDeserializer<ExecuteLifecycleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecuteLifecycleResponse::setupExecuteLifecycleResponseDeserializer);

	protected static void setupExecuteLifecycleResponseDeserializer(
			ObjectDeserializer<ExecuteLifecycleResponse.Builder> op) {

		op.add(Builder::snapshotName, JsonpDeserializer.stringDeserializer(), "snapshot_name");

	}

}
