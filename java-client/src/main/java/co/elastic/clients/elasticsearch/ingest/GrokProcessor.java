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

package co.elastic.clients.elasticsearch.ingest;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.GrokProcessor
@JsonpDeserializable
public final class GrokProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	private final Map<String, String> patternDefinitions;

	private final List<String> patterns;

	@Nullable
	private final Boolean traceMatch;

	// ---------------------------------------------------------------------------------------------

	public GrokProcessor(Builder builder) {
		super(builder);

		this.field = Objects.requireNonNull(builder.field, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.patternDefinitions = ModelTypeHelper.unmodifiableNonNull(builder.patternDefinitions,
				"pattern_definitions");
		this.patterns = ModelTypeHelper.unmodifiableNonNull(builder.patterns, "patterns");
		this.traceMatch = builder.traceMatch;

	}

	public GrokProcessor(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "grok";
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code pattern_definitions}
	 */
	public Map<String, String> patternDefinitions() {
		return this.patternDefinitions;
	}

	/**
	 * API name: {@code patterns}
	 */
	public List<String> patterns() {
		return this.patterns;
	}

	/**
	 * API name: {@code trace_match}
	 */
	@Nullable
	public Boolean traceMatch() {
		return this.traceMatch;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {

			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}

		generator.writeKey("pattern_definitions");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.patternDefinitions.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("patterns");
		generator.writeStartArray();
		for (String item0 : this.patterns) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.traceMatch != null) {

			generator.writeKey("trace_match");
			generator.write(this.traceMatch);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GrokProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<GrokProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		private Map<String, String> patternDefinitions;

		private List<String> patterns;

		@Nullable
		private Boolean traceMatch;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code pattern_definitions}
		 */
		public Builder patternDefinitions(Map<String, String> value) {
			this.patternDefinitions = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #patternDefinitions(Map)}, creating the map if
		 * needed.
		 */
		public Builder putPatternDefinitions(String key, String value) {
			if (this.patternDefinitions == null) {
				this.patternDefinitions = new HashMap<>();
			}
			this.patternDefinitions.put(key, value);
			return this;
		}

		/**
		 * API name: {@code patterns}
		 */
		public Builder patterns(List<String> value) {
			this.patterns = value;
			return this;
		}

		/**
		 * API name: {@code patterns}
		 */
		public Builder patterns(String... value) {
			this.patterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #patterns(List)}, creating the list if needed. 4
		 */
		public Builder addPatterns(String value) {
			if (this.patterns == null) {
				this.patterns = new ArrayList<>();
			}
			this.patterns.add(value);
			return this;
		}

		/**
		 * API name: {@code trace_match}
		 */
		public Builder traceMatch(@Nullable Boolean value) {
			this.traceMatch = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GrokProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GrokProcessor build() {

			return new GrokProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GrokProcessor}
	 */
	public static final JsonpDeserializer<GrokProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GrokProcessor::setupGrokProcessorDeserializer, Builder::build);

	protected static void setupGrokProcessorDeserializer(DelegatingDeserializer<GrokProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::patternDefinitions,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "pattern_definitions");
		op.add(Builder::patterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");
		op.add(Builder::traceMatch, JsonpDeserializer.booleanDeserializer(), "trace_match");

	}

}
