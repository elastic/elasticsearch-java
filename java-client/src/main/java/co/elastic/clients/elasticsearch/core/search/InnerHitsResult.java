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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonData;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.InnerHitsResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.InnerHitsResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class InnerHitsResult implements JsonpSerializable {
	private final HitsMetadata<JsonData> hits;

	// ---------------------------------------------------------------------------------------------

	private InnerHitsResult(Builder builder) {

		this.hits = ApiTypeHelper.requireNonNull(builder.hits, this, "hits");

	}

	public static InnerHitsResult of(Function<Builder, ObjectBuilder<InnerHitsResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public final HitsMetadata<JsonData> hits() {
		return this.hits;
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

		generator.writeKey("hits");
		this.hits.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InnerHitsResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<InnerHitsResult> {
		private HitsMetadata<JsonData> hits;

		/**
		 * Required - API name: {@code hits}
		 */
		public final Builder hits(HitsMetadata<JsonData> value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public final Builder hits(Function<HitsMetadata.Builder<JsonData>, ObjectBuilder<HitsMetadata<JsonData>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<JsonData>()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InnerHitsResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InnerHitsResult build() {
			_checkSingleUse();

			return new InnerHitsResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InnerHitsResult}
	 */
	public static final JsonpDeserializer<InnerHitsResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InnerHitsResult::setupInnerHitsResultDeserializer);

	protected static void setupInnerHitsResultDeserializer(ObjectDeserializer<InnerHitsResult.Builder> op) {

		op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(JsonData._DESERIALIZER), "hits");

	}

}
