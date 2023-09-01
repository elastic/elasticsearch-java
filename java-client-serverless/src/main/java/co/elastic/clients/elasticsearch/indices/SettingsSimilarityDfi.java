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

import co.elastic.clients.elasticsearch._types.DFIIndependenceMeasure;
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

// typedef: indices._types.SettingsSimilarityDfi

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityDfi">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityDfi implements JsonpSerializable {
	private final DFIIndependenceMeasure independenceMeasure;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityDfi(Builder builder) {

		this.independenceMeasure = ApiTypeHelper.requireNonNull(builder.independenceMeasure, this,
				"independenceMeasure");

	}

	public static SettingsSimilarityDfi of(Function<Builder, ObjectBuilder<SettingsSimilarityDfi>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code independence_measure}
	 */
	public final DFIIndependenceMeasure independenceMeasure() {
		return this.independenceMeasure;
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

		generator.writeKey("independence_measure");
		this.independenceMeasure.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityDfi}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityDfi> {
		private DFIIndependenceMeasure independenceMeasure;

		/**
		 * Required - API name: {@code independence_measure}
		 */
		public final Builder independenceMeasure(DFIIndependenceMeasure value) {
			this.independenceMeasure = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityDfi}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityDfi build() {
			_checkSingleUse();

			return new SettingsSimilarityDfi(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityDfi}
	 */
	public static final JsonpDeserializer<SettingsSimilarityDfi> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityDfi::setupSettingsSimilarityDfiDeserializer);

	protected static void setupSettingsSimilarityDfiDeserializer(ObjectDeserializer<SettingsSimilarityDfi.Builder> op) {

		op.add(Builder::independenceMeasure, DFIIndependenceMeasure._DESERIALIZER, "independence_measure");

	}

}
