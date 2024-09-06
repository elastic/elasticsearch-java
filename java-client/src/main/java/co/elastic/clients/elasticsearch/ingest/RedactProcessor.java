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

package co.elastic.clients.elasticsearch.ingest;

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
import java.util.Map;
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

// typedef: ingest._types.RedactProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.RedactProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class RedactProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final List<String> patterns;

	private final Map<String, String> patternDefinitions;

	@Nullable
	private final String prefix;

	@Nullable
	private final String suffix;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final Boolean skipIfUnlicensed;

	// ---------------------------------------------------------------------------------------------

	private RedactProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.patterns = ApiTypeHelper.unmodifiableRequired(builder.patterns, this, "patterns");
		this.patternDefinitions = ApiTypeHelper.unmodifiable(builder.patternDefinitions);
		this.prefix = builder.prefix;
		this.suffix = builder.suffix;
		this.ignoreMissing = builder.ignoreMissing;
		this.skipIfUnlicensed = builder.skipIfUnlicensed;

	}

	public static RedactProcessor of(Function<Builder, ObjectBuilder<RedactProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Redact;
	}

	/**
	 * Required - The field to be redacted
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - A list of grok expressions to match and redact named captures with
	 * <p>
	 * API name: {@code patterns}
	 */
	public final List<String> patterns() {
		return this.patterns;
	}

	/**
	 * API name: {@code pattern_definitions}
	 */
	public final Map<String, String> patternDefinitions() {
		return this.patternDefinitions;
	}

	/**
	 * Start a redacted section with this token
	 * <p>
	 * API name: {@code prefix}
	 */
	@Nullable
	public final String prefix() {
		return this.prefix;
	}

	/**
	 * End a redacted section with this token
	 * <p>
	 * API name: {@code suffix}
	 */
	@Nullable
	public final String suffix() {
		return this.suffix;
	}

	/**
	 * If <code>true</code> and <code>field</code> does not exist or is
	 * <code>null</code>, the processor quietly exits without modifying the
	 * document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * If <code>true</code> and the current license does not support running redact
	 * processors, then the processor quietly exits without modifying the document
	 * <p>
	 * API name: {@code skip_if_unlicensed}
	 */
	@Nullable
	public final Boolean skipIfUnlicensed() {
		return this.skipIfUnlicensed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.patterns)) {
			generator.writeKey("patterns");
			generator.writeStartArray();
			for (String item0 : this.patterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.patternDefinitions)) {
			generator.writeKey("pattern_definitions");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.patternDefinitions.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.prefix != null) {
			generator.writeKey("prefix");
			generator.write(this.prefix);

		}
		if (this.suffix != null) {
			generator.writeKey("suffix");
			generator.write(this.suffix);

		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.skipIfUnlicensed != null) {
			generator.writeKey("skip_if_unlicensed");
			generator.write(this.skipIfUnlicensed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RedactProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RedactProcessor> {
		private String field;

		private List<String> patterns;

		@Nullable
		private Map<String, String> patternDefinitions;

		@Nullable
		private String prefix;

		@Nullable
		private String suffix;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private Boolean skipIfUnlicensed;

		/**
		 * Required - The field to be redacted
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - A list of grok expressions to match and redact named captures with
		 * <p>
		 * API name: {@code patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>patterns</code>.
		 */
		public final Builder patterns(List<String> list) {
			this.patterns = _listAddAll(this.patterns, list);
			return this;
		}

		/**
		 * Required - A list of grok expressions to match and redact named captures with
		 * <p>
		 * API name: {@code patterns}
		 * <p>
		 * Adds one or more values to <code>patterns</code>.
		 */
		public final Builder patterns(String value, String... values) {
			this.patterns = _listAdd(this.patterns, value, values);
			return this;
		}

		/**
		 * API name: {@code pattern_definitions}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>patternDefinitions</code>.
		 */
		public final Builder patternDefinitions(Map<String, String> map) {
			this.patternDefinitions = _mapPutAll(this.patternDefinitions, map);
			return this;
		}

		/**
		 * API name: {@code pattern_definitions}
		 * <p>
		 * Adds an entry to <code>patternDefinitions</code>.
		 */
		public final Builder patternDefinitions(String key, String value) {
			this.patternDefinitions = _mapPut(this.patternDefinitions, key, value);
			return this;
		}

		/**
		 * Start a redacted section with this token
		 * <p>
		 * API name: {@code prefix}
		 */
		public final Builder prefix(@Nullable String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * End a redacted section with this token
		 * <p>
		 * API name: {@code suffix}
		 */
		public final Builder suffix(@Nullable String value) {
			this.suffix = value;
			return this;
		}

		/**
		 * If <code>true</code> and <code>field</code> does not exist or is
		 * <code>null</code>, the processor quietly exits without modifying the
		 * document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * If <code>true</code> and the current license does not support running redact
		 * processors, then the processor quietly exits without modifying the document
		 * <p>
		 * API name: {@code skip_if_unlicensed}
		 */
		public final Builder skipIfUnlicensed(@Nullable Boolean value) {
			this.skipIfUnlicensed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RedactProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RedactProcessor build() {
			_checkSingleUse();

			return new RedactProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RedactProcessor}
	 */
	public static final JsonpDeserializer<RedactProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RedactProcessor::setupRedactProcessorDeserializer);

	protected static void setupRedactProcessorDeserializer(ObjectDeserializer<RedactProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::patterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");
		op.add(Builder::patternDefinitions,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "pattern_definitions");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::suffix, JsonpDeserializer.stringDeserializer(), "suffix");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::skipIfUnlicensed, JsonpDeserializer.booleanDeserializer(), "skip_if_unlicensed");

	}

}
