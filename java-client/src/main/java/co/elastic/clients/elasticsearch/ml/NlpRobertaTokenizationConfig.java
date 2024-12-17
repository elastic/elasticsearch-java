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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: ml._types.NlpRobertaTokenizationConfig

/**
 * RoBERTa tokenization configuration options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.NlpRobertaTokenizationConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class NlpRobertaTokenizationConfig extends CommonTokenizationConfig implements TokenizationConfigVariant {
	@Nullable
	private final Boolean addPrefixSpace;

	// ---------------------------------------------------------------------------------------------

	private NlpRobertaTokenizationConfig(Builder builder) {
		super(builder);

		this.addPrefixSpace = builder.addPrefixSpace;

	}

	public static NlpRobertaTokenizationConfig of(Function<Builder, ObjectBuilder<NlpRobertaTokenizationConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizationConfig variant kind.
	 */
	@Override
	public TokenizationConfig.Kind _tokenizationConfigKind() {
		return TokenizationConfig.Kind.Roberta;
	}

	/**
	 * Should the tokenizer prefix input with a space character
	 * <p>
	 * API name: {@code add_prefix_space}
	 */
	@Nullable
	public final Boolean addPrefixSpace() {
		return this.addPrefixSpace;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.addPrefixSpace != null) {
			generator.writeKey("add_prefix_space");
			generator.write(this.addPrefixSpace);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NlpRobertaTokenizationConfig}.
	 */

	public static class Builder extends CommonTokenizationConfig.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NlpRobertaTokenizationConfig> {
		@Nullable
		private Boolean addPrefixSpace;

		/**
		 * Should the tokenizer prefix input with a space character
		 * <p>
		 * API name: {@code add_prefix_space}
		 */
		public final Builder addPrefixSpace(@Nullable Boolean value) {
			this.addPrefixSpace = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NlpRobertaTokenizationConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NlpRobertaTokenizationConfig build() {
			_checkSingleUse();

			return new NlpRobertaTokenizationConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NlpRobertaTokenizationConfig}
	 */
	public static final JsonpDeserializer<NlpRobertaTokenizationConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NlpRobertaTokenizationConfig::setupNlpRobertaTokenizationConfigDeserializer);

	protected static void setupNlpRobertaTokenizationConfigDeserializer(
			ObjectDeserializer<NlpRobertaTokenizationConfig.Builder> op) {
		CommonTokenizationConfig.setupCommonTokenizationConfigDeserializer(op);
		op.add(Builder::addPrefixSpace, JsonpDeserializer.booleanDeserializer(), "add_prefix_space");

	}

}
