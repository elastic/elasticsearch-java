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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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

// typedef: _types.analysis.PathHierarchyTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PathHierarchyTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class PathHierarchyTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	@Nullable
	private final Integer bufferSize;

	@Nullable
	private final String delimiter;

	@Nullable
	private final String replacement;

	@Nullable
	private final Boolean reverse;

	@Nullable
	private final Integer skip;

	// ---------------------------------------------------------------------------------------------

	private PathHierarchyTokenizer(Builder builder) {
		super(builder);

		this.bufferSize = builder.bufferSize;
		this.delimiter = builder.delimiter;
		this.replacement = builder.replacement;
		this.reverse = builder.reverse;
		this.skip = builder.skip;

	}

	public static PathHierarchyTokenizer of(Function<Builder, ObjectBuilder<PathHierarchyTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizerDefinition variant kind.
	 */
	@Override
	public TokenizerDefinition.Kind _tokenizerDefinitionKind() {
		return TokenizerDefinition.Kind.PathHierarchy;
	}

	/**
	 * API name: {@code buffer_size}
	 */
	@Nullable
	public final Integer bufferSize() {
		return this.bufferSize;
	}

	/**
	 * API name: {@code delimiter}
	 */
	@Nullable
	public final String delimiter() {
		return this.delimiter;
	}

	/**
	 * API name: {@code replacement}
	 */
	@Nullable
	public final String replacement() {
		return this.replacement;
	}

	/**
	 * API name: {@code reverse}
	 */
	@Nullable
	public final Boolean reverse() {
		return this.reverse;
	}

	/**
	 * API name: {@code skip}
	 */
	@Nullable
	public final Integer skip() {
		return this.skip;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "path_hierarchy");
		super.serializeInternal(generator, mapper);
		if (this.bufferSize != null) {
			generator.writeKey("buffer_size");
			generator.write(this.bufferSize);

		}
		if (this.delimiter != null) {
			generator.writeKey("delimiter");
			generator.write(this.delimiter);

		}
		if (this.replacement != null) {
			generator.writeKey("replacement");
			generator.write(this.replacement);

		}
		if (this.reverse != null) {
			generator.writeKey("reverse");
			generator.write(this.reverse);

		}
		if (this.skip != null) {
			generator.writeKey("skip");
			generator.write(this.skip);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PathHierarchyTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PathHierarchyTokenizer> {
		@Nullable
		private Integer bufferSize;

		@Nullable
		private String delimiter;

		@Nullable
		private String replacement;

		@Nullable
		private Boolean reverse;

		@Nullable
		private Integer skip;

		/**
		 * API name: {@code buffer_size}
		 */
		public final Builder bufferSize(@Nullable Integer value) {
			this.bufferSize = value;
			return this;
		}

		/**
		 * API name: {@code delimiter}
		 */
		public final Builder delimiter(@Nullable String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * API name: {@code replacement}
		 */
		public final Builder replacement(@Nullable String value) {
			this.replacement = value;
			return this;
		}

		/**
		 * API name: {@code reverse}
		 */
		public final Builder reverse(@Nullable Boolean value) {
			this.reverse = value;
			return this;
		}

		/**
		 * API name: {@code skip}
		 */
		public final Builder skip(@Nullable Integer value) {
			this.skip = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PathHierarchyTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PathHierarchyTokenizer build() {
			_checkSingleUse();

			return new PathHierarchyTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PathHierarchyTokenizer}
	 */
	public static final JsonpDeserializer<PathHierarchyTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PathHierarchyTokenizer::setupPathHierarchyTokenizerDeserializer);

	protected static void setupPathHierarchyTokenizerDeserializer(
			ObjectDeserializer<PathHierarchyTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::bufferSize, JsonpDeserializer.integerDeserializer(), "buffer_size");
		op.add(Builder::delimiter, JsonpDeserializer.stringDeserializer(), "delimiter");
		op.add(Builder::replacement, JsonpDeserializer.stringDeserializer(), "replacement");
		op.add(Builder::reverse, JsonpDeserializer.booleanDeserializer(), "reverse");
		op.add(Builder::skip, JsonpDeserializer.integerDeserializer(), "skip");

		op.ignore("type");
	}

}
