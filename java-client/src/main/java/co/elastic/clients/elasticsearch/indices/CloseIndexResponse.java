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
import co.elastic.clients.elasticsearch.indices.close.CloseIndexResult;
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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.close.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.close.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CloseIndexResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	private final Map<String, CloseIndexResult> indices;

	private final boolean shardsAcknowledged;

	// ---------------------------------------------------------------------------------------------

	private CloseIndexResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.shardsAcknowledged = ApiTypeHelper.requireNonNull(builder.shardsAcknowledged, this, "shardsAcknowledged");

	}

	public static CloseIndexResponse of(Function<Builder, ObjectBuilder<CloseIndexResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final Map<String, CloseIndexResult> indices() {
		return this.indices;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, CloseIndexResult> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseIndexResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CloseIndexResponse> {
		private Boolean acknowledged;

		private Map<String, CloseIndexResult> indices;

		private Boolean shardsAcknowledged;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indices</code>.
		 */
		public final Builder indices(Map<String, CloseIndexResult> map) {
			this.indices = _mapPutAll(this.indices, map);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code>.
		 */
		public final Builder indices(String key, CloseIndexResult value) {
			this.indices = _mapPut(this.indices, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(String key,
				Function<CloseIndexResult.Builder, ObjectBuilder<CloseIndexResult>> fn) {
			return indices(key, fn.apply(new CloseIndexResult.Builder()).build());
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
		 * Builds a {@link CloseIndexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseIndexResponse build() {
			_checkSingleUse();

			return new CloseIndexResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseIndexResponse}
	 */
	public static final JsonpDeserializer<CloseIndexResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CloseIndexResponse::setupCloseIndexResponseDeserializer);

	protected static void setupCloseIndexResponseDeserializer(ObjectDeserializer<CloseIndexResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(CloseIndexResult._DESERIALIZER), "indices");
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");

	}

}
