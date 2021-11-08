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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternCaptureTokenFilter
@JsonpDeserializable
public class PatternCaptureTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> patterns;

	private final boolean preserveOriginal;

	// ---------------------------------------------------------------------------------------------

	private PatternCaptureTokenFilter(Builder builder) {
		super(builder);

		this.patterns = ModelTypeHelper.unmodifiableRequired(builder.patterns, this, "patterns");
		this.preserveOriginal = ModelTypeHelper.requireNonNull(builder.preserveOriginal, this, "preserveOriginal");

	}

	public static PatternCaptureTokenFilter of(Function<Builder, ObjectBuilder<PatternCaptureTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "pattern_capture";
	}

	/**
	 * Required - API name: {@code patterns}
	 */
	public final List<String> patterns() {
		return this.patterns;
	}

	/**
	 * Required - API name: {@code preserve_original}
	 */
	public final boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern_capture");
		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.patterns)) {
			generator.writeKey("patterns");
			generator.writeStartArray();
			for (String item0 : this.patterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("preserve_original");
		generator.write(this.preserveOriginal);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternCaptureTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternCaptureTokenFilter> {
		private List<String> patterns;

		private Boolean preserveOriginal;

		/**
		 * Required - API name: {@code patterns}
		 */
		public final Builder patterns(List<String> value) {
			this.patterns = value;
			return this;
		}

		/**
		 * Required - API name: {@code patterns}
		 */
		public final Builder patterns(String... value) {
			this.patterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code preserve_original}
		 */
		public final Builder preserveOriginal(boolean value) {
			this.preserveOriginal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PatternCaptureTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternCaptureTokenFilter build() {
			_checkSingleUse();

			return new PatternCaptureTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternCaptureTokenFilter}
	 */
	public static final JsonpDeserializer<PatternCaptureTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PatternCaptureTokenFilter::setupPatternCaptureTokenFilterDeserializer, Builder::build);

	protected static void setupPatternCaptureTokenFilterDeserializer(
			DelegatingDeserializer<PatternCaptureTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::patterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");
		op.add(Builder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");

		op.ignore("type");
	}

}
