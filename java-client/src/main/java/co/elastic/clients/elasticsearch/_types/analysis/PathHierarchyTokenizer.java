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

import co.elastic.clients.json.DelegatingDeserializer;
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

// typedef: _types.analysis.PathHierarchyTokenizer
@JsonpDeserializable
public final class PathHierarchyTokenizer extends TokenizerBase implements TokenizerVariant {
	private final int bufferSize;

	private final String delimiter;

	private final String replacement;

	private final boolean reverse;

	private final int skip;

	// ---------------------------------------------------------------------------------------------

	public PathHierarchyTokenizer(Builder builder) {
		super(builder);

		this.bufferSize = Objects.requireNonNull(builder.bufferSize, "buffer_size");
		this.delimiter = Objects.requireNonNull(builder.delimiter, "delimiter");
		this.replacement = Objects.requireNonNull(builder.replacement, "replacement");
		this.reverse = Objects.requireNonNull(builder.reverse, "reverse");
		this.skip = Objects.requireNonNull(builder.skip, "skip");

	}

	public PathHierarchyTokenizer(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "path_hierarchy";
	}

	/**
	 * API name: {@code buffer_size}
	 */
	public int bufferSize() {
		return this.bufferSize;
	}

	/**
	 * API name: {@code delimiter}
	 */
	public String delimiter() {
		return this.delimiter;
	}

	/**
	 * API name: {@code replacement}
	 */
	public String replacement() {
		return this.replacement;
	}

	/**
	 * API name: {@code reverse}
	 */
	public boolean reverse() {
		return this.reverse;
	}

	/**
	 * API name: {@code skip}
	 */
	public int skip() {
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
		 * API name: {@code buffer_size}
		 */
		public Builder bufferSize(int value) {
			this.bufferSize = value;
			return this;
		}

		/**
		 * API name: {@code delimiter}
		 */
		public Builder delimiter(String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * API name: {@code replacement}
		 */
		public Builder replacement(String value) {
			this.replacement = value;
			return this;
		}

		/**
		 * API name: {@code reverse}
		 */
		public Builder reverse(boolean value) {
			this.reverse = value;
			return this;
		}

		/**
		 * API name: {@code skip}
		 */
		public Builder skip(int value) {
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

			return new PathHierarchyTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PathHierarchyTokenizer}
	 */
	public static final JsonpDeserializer<PathHierarchyTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PathHierarchyTokenizer::setupPathHierarchyTokenizerDeserializer, Builder::build);

	protected static void setupPathHierarchyTokenizerDeserializer(
			DelegatingDeserializer<PathHierarchyTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::bufferSize, JsonpDeserializer.integerDeserializer(), "buffer_size");
		op.add(Builder::delimiter, JsonpDeserializer.stringDeserializer(), "delimiter");
		op.add(Builder::replacement, JsonpDeserializer.stringDeserializer(), "replacement");
		op.add(Builder::reverse, JsonpDeserializer.booleanDeserializer(), "reverse");
		op.add(Builder::skip, JsonpDeserializer.integerDeserializer(), "skip");

		op.ignore("type");
	}

}
