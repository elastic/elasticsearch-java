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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.create.Response
@JsonpDeserializable
public class CreateIndexResponse implements JsonpSerializable {
	private final String index;

	private final boolean shardsAcknowledged;

	@Nullable
	private final Boolean acknowledged;

	// ---------------------------------------------------------------------------------------------

	private CreateIndexResponse(Builder builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.shardsAcknowledged = ModelTypeHelper.requireNonNull(builder.shardsAcknowledged, this,
				"shardsAcknowledged");
		this.acknowledged = builder.acknowledged;

	}

	public static CreateIndexResponse of(Function<Builder, ObjectBuilder<CreateIndexResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code shards_acknowledged}
	 */
	public final boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
	}

	/**
	 * API name: {@code acknowledged}
	 */
	@Nullable
	public final Boolean acknowledged() {
		return this.acknowledged;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

		if (this.acknowledged != null) {
			generator.writeKey("acknowledged");
			generator.write(this.acknowledged);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateIndexResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CreateIndexResponse> {
		private String index;

		private Boolean shardsAcknowledged;

		@Nullable
		private Boolean acknowledged;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards_acknowledged}
		 */
		public final Builder shardsAcknowledged(boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		/**
		 * API name: {@code acknowledged}
		 */
		public final Builder acknowledged(@Nullable Boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Builds a {@link CreateIndexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateIndexResponse build() {
			_checkSingleUse();

			return new CreateIndexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateIndexResponse}
	 */
	public static final JsonpDeserializer<CreateIndexResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateIndexResponse::setupCreateIndexResponseDeserializer, Builder::build);

	protected static void setupCreateIndexResponseDeserializer(DelegatingDeserializer<CreateIndexResponse.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");
		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");

	}

}
