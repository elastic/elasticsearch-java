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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices._types.SettingsSimilarityBm25

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityBm25">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityBm25 implements JsonpSerializable {
	private final double b;

	private final boolean discountOverlaps;

	private final double k1;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityBm25(Builder builder) {

		this.b = ApiTypeHelper.requireNonNull(builder.b, this, "b");
		this.discountOverlaps = ApiTypeHelper.requireNonNull(builder.discountOverlaps, this, "discountOverlaps");
		this.k1 = ApiTypeHelper.requireNonNull(builder.k1, this, "k1");

	}

	public static SettingsSimilarityBm25 of(Function<Builder, ObjectBuilder<SettingsSimilarityBm25>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code b}
	 */
	public final double b() {
		return this.b;
	}

	/**
	 * Required - API name: {@code discount_overlaps}
	 */
	public final boolean discountOverlaps() {
		return this.discountOverlaps;
	}

	/**
	 * Required - API name: {@code k1}
	 */
	public final double k1() {
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

		generator.writeKey("b");
		generator.write(this.b);

		generator.writeKey("discount_overlaps");
		generator.write(this.discountOverlaps);

		generator.writeKey("k1");
		generator.write(this.k1);

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
		private Double b;

		private Boolean discountOverlaps;

		private Double k1;

		/**
		 * Required - API name: {@code b}
		 */
		public final Builder b(double value) {
			this.b = value;
			return this;
		}

		/**
		 * Required - API name: {@code discount_overlaps}
		 */
		public final Builder discountOverlaps(boolean value) {
			this.discountOverlaps = value;
			return this;
		}

		/**
		 * Required - API name: {@code k1}
		 */
		public final Builder k1(double value) {
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

	}

}
