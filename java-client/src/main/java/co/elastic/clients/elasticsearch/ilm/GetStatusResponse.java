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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch._types.LifecycleOperationMode;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.get_status.Response
@JsonpDeserializable
public class GetStatusResponse implements JsonpSerializable {
	private final LifecycleOperationMode operationMode;

	// ---------------------------------------------------------------------------------------------

	private GetStatusResponse(Builder builder) {

		this.operationMode = ModelTypeHelper.requireNonNull(builder.operationMode, this, "operationMode");

	}

	public static GetStatusResponse of(Function<Builder, ObjectBuilder<GetStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code operation_mode}
	 */
	public final LifecycleOperationMode operationMode() {
		return this.operationMode;
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

		generator.writeKey("operation_mode");
		this.operationMode.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetStatusResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetStatusResponse> {
		private LifecycleOperationMode operationMode;

		/**
		 * Required - API name: {@code operation_mode}
		 */
		public final Builder operationMode(LifecycleOperationMode value) {
			this.operationMode = value;
			return this;
		}

		/**
		 * Builds a {@link GetStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetStatusResponse build() {
			_checkSingleUse();

			return new GetStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetStatusResponse}
	 */
	public static final JsonpDeserializer<GetStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetStatusResponse::setupGetStatusResponseDeserializer, Builder::build);

	protected static void setupGetStatusResponseDeserializer(DelegatingDeserializer<GetStatusResponse.Builder> op) {

		op.add(Builder::operationMode, LifecycleOperationMode._DESERIALIZER, "operation_mode");

	}

}
