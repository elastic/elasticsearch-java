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

// typedef: indices._types.SettingsSimilarityLmd

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityLmd">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityLmd implements SettingsSimilarityVariant, JsonpSerializable {
	@Nullable
	private final Double mu;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityLmd(Builder builder) {

		this.mu = builder.mu;

	}

	public static SettingsSimilarityLmd of(Function<Builder, ObjectBuilder<SettingsSimilarityLmd>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SettingsSimilarity variant kind.
	 */
	@Override
	public SettingsSimilarity.Kind _settingsSimilarityKind() {
		return SettingsSimilarity.Kind.LMDirichlet;
	}

	/**
	 * API name: {@code mu}
	 */
	@Nullable
	public final Double mu() {
		return this.mu;
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

		generator.write("type", "LMDirichlet");

		if (this.mu != null) {
			generator.writeKey("mu");
			generator.write(this.mu);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityLmd}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityLmd> {
		@Nullable
		private Double mu;

		/**
		 * API name: {@code mu}
		 */
		public final Builder mu(@Nullable Double value) {
			this.mu = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityLmd}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityLmd build() {
			_checkSingleUse();

			return new SettingsSimilarityLmd(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityLmd}
	 */
	public static final JsonpDeserializer<SettingsSimilarityLmd> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityLmd::setupSettingsSimilarityLmdDeserializer);

	protected static void setupSettingsSimilarityLmdDeserializer(ObjectDeserializer<SettingsSimilarityLmd.Builder> op) {

		op.add(Builder::mu, JsonpDeserializer.doubleDeserializer(), "mu");

		op.ignore("type");
	}

}
