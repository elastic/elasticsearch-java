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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.StopTokenFilter
@JsonpDeserializable
public final class StopTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	@Nullable
	private final Boolean ignoreCase;

	@Nullable
	private final Boolean removeTrailing;

	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	public StopTokenFilter(Builder builder) {
		super(builder);

		this.ignoreCase = builder.ignoreCase;
		this.removeTrailing = builder.removeTrailing;
		this.stopwords = ModelTypeHelper.unmodifiableNonNull(builder.stopwords, "stopwords");
		this.stopwordsPath = builder.stopwordsPath;

	}

	public StopTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "stop";
	}

	/**
	 * API name: {@code ignore_case}
	 */
	@Nullable
	public Boolean ignoreCase() {
		return this.ignoreCase;
	}

	/**
	 * API name: {@code remove_trailing}
	 */
	@Nullable
	public Boolean removeTrailing() {
		return this.removeTrailing;
	}

	/**
	 * Required - API name: {@code stopwords}
	 */
	public List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * API name: {@code stopwords_path}
	 */
	@Nullable
	public String stopwordsPath() {
		return this.stopwordsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "stop");
		super.serializeInternal(generator, mapper);
		if (this.ignoreCase != null) {

			generator.writeKey("ignore_case");
			generator.write(this.ignoreCase);

		}
		if (this.removeTrailing != null) {

			generator.writeKey("remove_trailing");
			generator.write(this.removeTrailing);

		}

		generator.writeKey("stopwords");
		generator.writeStartArray();
		for (String item0 : this.stopwords) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.stopwordsPath != null) {

			generator.writeKey("stopwords_path");
			generator.write(this.stopwordsPath);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StopTokenFilter> {
		@Nullable
		private Boolean ignoreCase;

		@Nullable
		private Boolean removeTrailing;

		private List<String> stopwords;

		@Nullable
		private String stopwordsPath;

		/**
		 * API name: {@code ignore_case}
		 */
		public Builder ignoreCase(@Nullable Boolean value) {
			this.ignoreCase = value;
			return this;
		}

		/**
		 * API name: {@code remove_trailing}
		 */
		public Builder removeTrailing(@Nullable Boolean value) {
			this.removeTrailing = value;
			return this;
		}

		/**
		 * Required - API name: {@code stopwords}
		 */
		public Builder stopwords(List<String> value) {
			this.stopwords = value;
			return this;
		}

		/**
		 * Required - API name: {@code stopwords}
		 */
		public Builder stopwords(String... value) {
			this.stopwords = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stopwords(List)}, creating the list if needed.
		 */
		public Builder addStopwords(String value) {
			if (this.stopwords == null) {
				this.stopwords = new ArrayList<>();
			}
			this.stopwords.add(value);
			return this;
		}

		/**
		 * API name: {@code stopwords_path}
		 */
		public Builder stopwordsPath(@Nullable String value) {
			this.stopwordsPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StopTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopTokenFilter build() {

			return new StopTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopTokenFilter}
	 */
	public static final JsonpDeserializer<StopTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StopTokenFilter::setupStopTokenFilterDeserializer, Builder::build);

	protected static void setupStopTokenFilterDeserializer(DelegatingDeserializer<StopTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::ignoreCase, JsonpDeserializer.booleanDeserializer(), "ignore_case");
		op.add(Builder::removeTrailing, JsonpDeserializer.booleanDeserializer(), "remove_trailing");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
