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

package co.elastic.clients.elasticsearch.inference;

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
import java.lang.Integer;
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

// typedef: inference._types.ThinkingConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#inference._types.ThinkingConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class ThinkingConfig implements JsonpSerializable {
	@Nullable
	private final Integer thinkingBudget;

	// ---------------------------------------------------------------------------------------------

	private ThinkingConfig(Builder builder) {

		this.thinkingBudget = builder.thinkingBudget;

	}

	public static ThinkingConfig of(Function<Builder, ObjectBuilder<ThinkingConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates the desired thinking budget in tokens.
	 * <p>
	 * API name: {@code thinking_budget}
	 */
	@Nullable
	public final Integer thinkingBudget() {
		return this.thinkingBudget;
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

		if (this.thinkingBudget != null) {
			generator.writeKey("thinking_budget");
			generator.write(this.thinkingBudget);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThinkingConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ThinkingConfig> {
		@Nullable
		private Integer thinkingBudget;

		/**
		 * Indicates the desired thinking budget in tokens.
		 * <p>
		 * API name: {@code thinking_budget}
		 */
		public final Builder thinkingBudget(@Nullable Integer value) {
			this.thinkingBudget = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ThinkingConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThinkingConfig build() {
			_checkSingleUse();

			return new ThinkingConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ThinkingConfig}
	 */
	public static final JsonpDeserializer<ThinkingConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ThinkingConfig::setupThinkingConfigDeserializer);

	protected static void setupThinkingConfigDeserializer(ObjectDeserializer<ThinkingConfig.Builder> op) {

		op.add(Builder::thinkingBudget, JsonpDeserializer.integerDeserializer(), "thinking_budget");

	}

}
