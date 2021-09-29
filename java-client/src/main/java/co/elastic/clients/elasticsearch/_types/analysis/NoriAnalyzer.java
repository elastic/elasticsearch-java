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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.NoriAnalyzer
@JsonpDeserializable
public final class NoriAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final String version;

	private final NoriDecompoundMode decompoundMode;

	private final List<String> stoptags;

	private final String userDictionary;

	// ---------------------------------------------------------------------------------------------

	public NoriAnalyzer(Builder builder) {

		this.version = Objects.requireNonNull(builder.version, "version");
		this.decompoundMode = Objects.requireNonNull(builder.decompoundMode, "decompound_mode");
		this.stoptags = ModelTypeHelper.unmodifiableNonNull(builder.stoptags, "stoptags");
		this.userDictionary = Objects.requireNonNull(builder.userDictionary, "user_dictionary");

	}

	public NoriAnalyzer(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "nori";
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code decompound_mode}
	 */
	public NoriDecompoundMode decompoundMode() {
		return this.decompoundMode;
	}

	/**
	 * API name: {@code stoptags}
	 */
	public List<String> stoptags() {
		return this.stoptags;
	}

	/**
	 * API name: {@code user_dictionary}
	 */
	public String userDictionary() {
		return this.userDictionary;
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

		generator.write("type", "nori");

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("decompound_mode");
		this.decompoundMode.serialize(generator, mapper);

		generator.writeKey("stoptags");
		generator.writeStartArray();
		for (String item0 : this.stoptags) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("user_dictionary");
		generator.write(this.userDictionary);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NoriAnalyzer}.
	 */
	public static class Builder implements ObjectBuilder<NoriAnalyzer> {
		private String version;

		private NoriDecompoundMode decompoundMode;

		private List<String> stoptags;

		private String userDictionary;

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code decompound_mode}
		 */
		public Builder decompoundMode(NoriDecompoundMode value) {
			this.decompoundMode = value;
			return this;
		}

		/**
		 * API name: {@code stoptags}
		 */
		public Builder stoptags(List<String> value) {
			this.stoptags = value;
			return this;
		}

		/**
		 * API name: {@code stoptags}
		 */
		public Builder stoptags(String... value) {
			this.stoptags = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stoptags(List)}, creating the list if needed. 4
		 */
		public Builder addStoptags(String value) {
			if (this.stoptags == null) {
				this.stoptags = new ArrayList<>();
			}
			this.stoptags.add(value);
			return this;
		}

		/**
		 * API name: {@code user_dictionary}
		 */
		public Builder userDictionary(String value) {
			this.userDictionary = value;
			return this;
		}

		/**
		 * Builds a {@link NoriAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NoriAnalyzer build() {

			return new NoriAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NoriAnalyzer}
	 */
	public static final JsonpDeserializer<NoriAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NoriAnalyzer::setupNoriAnalyzerDeserializer, Builder::build);

	protected static void setupNoriAnalyzerDeserializer(DelegatingDeserializer<NoriAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::decompoundMode, NoriDecompoundMode._DESERIALIZER, "decompound_mode");
		op.add(Builder::stoptags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stoptags");
		op.add(Builder::userDictionary, JsonpDeserializer.stringDeserializer(), "user_dictionary");

		op.ignore("type");
	}

}
