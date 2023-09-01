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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternCaptureTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PatternCaptureTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class PatternCaptureTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final List<String> patterns;

	@Nullable
	private final Boolean preserveOriginal;

	// ---------------------------------------------------------------------------------------------

	private PatternCaptureTokenFilter(Builder builder) {
		super(builder);

		this.patterns = ApiTypeHelper.unmodifiableRequired(builder.patterns, this, "patterns");
		this.preserveOriginal = builder.preserveOriginal;

	}

	public static PatternCaptureTokenFilter of(Function<Builder, ObjectBuilder<PatternCaptureTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.PatternCapture;
	}

	/**
	 * Required - API name: {@code patterns}
	 */
	public final List<String> patterns() {
		return this.patterns;
	}

	/**
	 * API name: {@code preserve_original}
	 */
	@Nullable
	public final Boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern_capture");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.patterns)) {
			generator.writeKey("patterns");
			generator.writeStartArray();
			for (String item0 : this.patterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.preserveOriginal != null) {
			generator.writeKey("preserve_original");
			generator.write(this.preserveOriginal);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternCaptureTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternCaptureTokenFilter> {
		private List<String> patterns;

		@Nullable
		private Boolean preserveOriginal;

		/**
		 * Required - API name: {@code patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>patterns</code>.
		 */
		public final Builder patterns(List<String> list) {
			this.patterns = _listAddAll(this.patterns, list);
			return this;
		}

		/**
		 * Required - API name: {@code patterns}
		 * <p>
		 * Adds one or more values to <code>patterns</code>.
		 */
		public final Builder patterns(String value, String... values) {
			this.patterns = _listAdd(this.patterns, value, values);
			return this;
		}

		/**
		 * API name: {@code preserve_original}
		 */
		public final Builder preserveOriginal(@Nullable Boolean value) {
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
			.lazy(Builder::new, PatternCaptureTokenFilter::setupPatternCaptureTokenFilterDeserializer);

	protected static void setupPatternCaptureTokenFilterDeserializer(
			ObjectDeserializer<PatternCaptureTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::patterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");
		op.add(Builder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");

		op.ignore("type");
	}

}
