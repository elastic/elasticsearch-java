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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.open.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.open.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class OpenResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	private final boolean shardsAcknowledged;

	// ---------------------------------------------------------------------------------------------

	private OpenResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.shardsAcknowledged = ApiTypeHelper.requireNonNull(builder.shardsAcknowledged, this, "shardsAcknowledged");

	}

	public static OpenResponse of(Function<Builder, ObjectBuilder<OpenResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - API name: {@code shards_acknowledged}
	 */
	public final boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
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

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<OpenResponse> {
		private Boolean acknowledged;

		private Boolean shardsAcknowledged;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards_acknowledged}
		 */
		public final Builder shardsAcknowledged(boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OpenResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenResponse build() {
			_checkSingleUse();

			return new OpenResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OpenResponse}
	 */
	public static final JsonpDeserializer<OpenResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			OpenResponse::setupOpenResponseDeserializer);

	protected static void setupOpenResponseDeserializer(ObjectDeserializer<OpenResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");

	}

}
