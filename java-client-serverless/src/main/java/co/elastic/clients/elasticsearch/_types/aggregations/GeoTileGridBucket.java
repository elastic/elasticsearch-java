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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoTileGridBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeoTileGridBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoTileGridBucket extends MultiBucketBase {
	private final String key;

	// ---------------------------------------------------------------------------------------------

	private GeoTileGridBucket(Builder builder) {
		super(builder);

		this.key = ApiTypeHelper.requireNonNull(builder.key, this, "key");

	}

	public static GeoTileGridBucket of(Function<Builder, ObjectBuilder<GeoTileGridBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final String key() {
		return this.key;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("key");
		generator.write(this.key);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoTileGridBucket}.
	 */

	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoTileGridBucket> {
		private String key;

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(String value) {
			this.key = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoTileGridBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoTileGridBucket build() {
			_checkSingleUse();

			return new GeoTileGridBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoTileGridBucket}
	 */
	public static final JsonpDeserializer<GeoTileGridBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoTileGridBucket::setupGeoTileGridBucketDeserializer);

	protected static void setupGeoTileGridBucketDeserializer(ObjectDeserializer<GeoTileGridBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");

	}

}
