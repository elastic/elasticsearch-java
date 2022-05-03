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

import co.elastic.clients.elasticsearch._types.DFRAfterEffect;
import co.elastic.clients.elasticsearch._types.DFRBasicModel;
import co.elastic.clients.elasticsearch._types.Normalization;
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

// typedef: indices._types.SettingsSimilarityDfr

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityDfr">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityDfr implements JsonpSerializable {
	private final DFRAfterEffect afterEffect;

	private final DFRBasicModel basicModel;

	private final Normalization normalization;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityDfr(Builder builder) {

		this.afterEffect = ApiTypeHelper.requireNonNull(builder.afterEffect, this, "afterEffect");
		this.basicModel = ApiTypeHelper.requireNonNull(builder.basicModel, this, "basicModel");
		this.normalization = ApiTypeHelper.requireNonNull(builder.normalization, this, "normalization");

	}

	public static SettingsSimilarityDfr of(Function<Builder, ObjectBuilder<SettingsSimilarityDfr>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code after_effect}
	 */
	public final DFRAfterEffect afterEffect() {
		return this.afterEffect;
	}

	/**
	 * Required - API name: {@code basic_model}
	 */
	public final DFRBasicModel basicModel() {
		return this.basicModel;
	}

	/**
	 * Required - API name: {@code normalization}
	 */
	public final Normalization normalization() {
		return this.normalization;
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

		generator.writeKey("after_effect");
		this.afterEffect.serialize(generator, mapper);
		generator.writeKey("basic_model");
		this.basicModel.serialize(generator, mapper);
		generator.writeKey("normalization");
		this.normalization.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityDfr}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityDfr> {
		private DFRAfterEffect afterEffect;

		private DFRBasicModel basicModel;

		private Normalization normalization;

		/**
		 * Required - API name: {@code after_effect}
		 */
		public final Builder afterEffect(DFRAfterEffect value) {
			this.afterEffect = value;
			return this;
		}

		/**
		 * Required - API name: {@code basic_model}
		 */
		public final Builder basicModel(DFRBasicModel value) {
			this.basicModel = value;
			return this;
		}

		/**
		 * Required - API name: {@code normalization}
		 */
		public final Builder normalization(Normalization value) {
			this.normalization = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityDfr}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityDfr build() {
			_checkSingleUse();

			return new SettingsSimilarityDfr(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityDfr}
	 */
	public static final JsonpDeserializer<SettingsSimilarityDfr> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityDfr::setupSettingsSimilarityDfrDeserializer);

	protected static void setupSettingsSimilarityDfrDeserializer(ObjectDeserializer<SettingsSimilarityDfr.Builder> op) {

		op.add(Builder::afterEffect, DFRAfterEffect._DESERIALIZER, "after_effect");
		op.add(Builder::basicModel, DFRBasicModel._DESERIALIZER, "basic_model");
		op.add(Builder::normalization, Normalization._DESERIALIZER, "normalization");

	}

}
