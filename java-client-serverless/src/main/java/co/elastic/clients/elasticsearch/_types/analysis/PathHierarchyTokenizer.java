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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PathHierarchyTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PathHierarchyTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class PathHierarchyTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	private final int bufferSize;

	private final String delimiter;

	private final String replacement;

	private final boolean reverse;

	private final int skip;

	// ---------------------------------------------------------------------------------------------

	private PathHierarchyTokenizer(Builder builder) {
		super(builder);

		this.bufferSize = ApiTypeHelper.requireNonNull(builder.bufferSize, this, "bufferSize");
		this.delimiter = ApiTypeHelper.requireNonNull(builder.delimiter, this, "delimiter");
		this.replacement = ApiTypeHelper.requireNonNull(builder.replacement, this, "replacement");
		this.reverse = ApiTypeHelper.requireNonNull(builder.reverse, this, "reverse");
		this.skip = ApiTypeHelper.requireNonNull(builder.skip, this, "skip");

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
	 * Required - API name: {@code buffer_size}
	 */
	public final int bufferSize() {
		return this.bufferSize;
	}

	/**
	 * Required - API name: {@code delimiter}
	 */
	public final String delimiter() {
		return this.delimiter;
	}

	/**
	 * Required - API name: {@code replacement}
	 */
	public final String replacement() {
		return this.replacement;
	}

	/**
	 * Required - API name: {@code reverse}
	 */
	public final boolean reverse() {
		return this.reverse;
	}

	/**
	 * Required - API name: {@code skip}
	 */
	public final int skip() {
		return this.skip;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "path_hierarchy");
		super.serializeInternal(generator, mapper);
		generator.writeKey("buffer_size");
		generator.write(this.bufferSize);

		generator.writeKey("delimiter");
		generator.write(this.delimiter);

		generator.writeKey("replacement");
		generator.write(this.replacement);

		generator.writeKey("reverse");
		generator.write(this.reverse);

		generator.writeKey("skip");
		generator.write(this.skip);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PathHierarchyTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PathHierarchyTokenizer> {
		private Integer bufferSize;

		private String delimiter;

		private String replacement;

		private Boolean reverse;

		private Integer skip;

		/**
		 * Required - API name: {@code buffer_size}
		 */
		public final Builder bufferSize(int value) {
			this.bufferSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code delimiter}
		 */
		public final Builder delimiter(String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * Required - API name: {@code replacement}
		 */
		public final Builder replacement(String value) {
			this.replacement = value;
			return this;
		}

		/**
		 * Required - API name: {@code reverse}
		 */
		public final Builder reverse(boolean value) {
			this.reverse = value;
			return this;
		}

		/**
		 * Required - API name: {@code skip}
		 */
		public final Builder skip(int value) {
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
