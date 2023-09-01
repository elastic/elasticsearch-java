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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices._types.SettingsSimilarityLmj

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityLmj">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityLmj implements JsonpSerializable {
	private final double lambda;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityLmj(Builder builder) {

		this.lambda = ApiTypeHelper.requireNonNull(builder.lambda, this, "lambda");

	}

	public static SettingsSimilarityLmj of(Function<Builder, ObjectBuilder<SettingsSimilarityLmj>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code lambda}
	 */
	public final double lambda() {
		return this.lambda;
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

		generator.writeKey("lambda");
		generator.write(this.lambda);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityLmj}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityLmj> {
		private Double lambda;

		/**
		 * Required - API name: {@code lambda}
		 */
		public final Builder lambda(double value) {
			this.lambda = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityLmj}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityLmj build() {
			_checkSingleUse();

			return new SettingsSimilarityLmj(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityLmj}
	 */
	public static final JsonpDeserializer<SettingsSimilarityLmj> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityLmj::setupSettingsSimilarityLmjDeserializer);

	protected static void setupSettingsSimilarityLmjDeserializer(ObjectDeserializer<SettingsSimilarityLmj.Builder> op) {

		op.add(Builder::lambda, JsonpDeserializer.doubleDeserializer(), "lambda");

	}

}
