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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
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

// typedef: indices._types.SettingsSimilarityBm25

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityBm25">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityBm25 implements SettingsSimilarityVariant, JsonpSerializable {
	@Nullable
	private final Double b;

	@Nullable
	private final Boolean discountOverlaps;

	@Nullable
	private final Double k1;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityBm25(Builder builder) {

		this.b = builder.b;
		this.discountOverlaps = builder.discountOverlaps;
		this.k1 = builder.k1;

	}

	public static SettingsSimilarityBm25 of(Function<Builder, ObjectBuilder<SettingsSimilarityBm25>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SettingsSimilarity variant kind.
	 */
	@Override
	public SettingsSimilarity.Kind _settingsSimilarityKind() {
		return SettingsSimilarity.Kind.Bm25;
	}

	/**
	 * API name: {@code b}
	 */
	@Nullable
	public final Double b() {
		return this.b;
	}

	/**
	 * API name: {@code discount_overlaps}
	 */
	@Nullable
	public final Boolean discountOverlaps() {
		return this.discountOverlaps;
	}

	/**
	 * API name: {@code k1}
	 */
	@Nullable
	public final Double k1() {
		return this.k1;
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

		generator.write("type", "BM25");

		if (this.b != null) {
			generator.writeKey("b");
			generator.write(this.b);

		}
		if (this.discountOverlaps != null) {
			generator.writeKey("discount_overlaps");
			generator.write(this.discountOverlaps);

		}
		if (this.k1 != null) {
			generator.writeKey("k1");
			generator.write(this.k1);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityBm25}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityBm25> {
		@Nullable
		private Double b;

		@Nullable
		private Boolean discountOverlaps;

		@Nullable
		private Double k1;

		/**
		 * API name: {@code b}
		 */
		public final Builder b(@Nullable Double value) {
			this.b = value;
			return this;
		}

		/**
		 * API name: {@code discount_overlaps}
		 */
		public final Builder discountOverlaps(@Nullable Boolean value) {
			this.discountOverlaps = value;
			return this;
		}

		/**
		 * API name: {@code k1}
		 */
		public final Builder k1(@Nullable Double value) {
			this.k1 = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityBm25}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityBm25 build() {
			_checkSingleUse();

			return new SettingsSimilarityBm25(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityBm25}
	 */
	public static final JsonpDeserializer<SettingsSimilarityBm25> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityBm25::setupSettingsSimilarityBm25Deserializer);

	protected static void setupSettingsSimilarityBm25Deserializer(
			ObjectDeserializer<SettingsSimilarityBm25.Builder> op) {

		op.add(Builder::b, JsonpDeserializer.doubleDeserializer(), "b");
		op.add(Builder::discountOverlaps, JsonpDeserializer.booleanDeserializer(), "discount_overlaps");
		op.add(Builder::k1, JsonpDeserializer.doubleDeserializer(), "k1");

		op.ignore("type");
	}

}
