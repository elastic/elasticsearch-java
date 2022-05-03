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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices._types.SettingsSimilarityLmd

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityLmd">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityLmd implements JsonpSerializable {
	private final int mu;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityLmd(Builder builder) {

		this.mu = ApiTypeHelper.requireNonNull(builder.mu, this, "mu");

	}

	public static SettingsSimilarityLmd of(Function<Builder, ObjectBuilder<SettingsSimilarityLmd>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code mu}
	 */
	public final int mu() {
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

		generator.writeKey("mu");
		generator.write(this.mu);

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
		private Integer mu;

		/**
		 * Required - API name: {@code mu}
		 */
		public final Builder mu(int value) {
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

		op.add(Builder::mu, JsonpDeserializer.integerDeserializer(), "mu");

	}

}
