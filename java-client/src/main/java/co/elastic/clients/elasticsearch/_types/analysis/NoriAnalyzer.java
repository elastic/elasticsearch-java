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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.NoriAnalyzer
@JsonpDeserializable
public class NoriAnalyzer implements AnalyzerVariant, JsonpSerializable {
	@Nullable
	private final String version;

	@Nullable
	private final NoriDecompoundMode decompoundMode;

	private final List<String> stoptags;

	@Nullable
	private final String userDictionary;

	// ---------------------------------------------------------------------------------------------

	private NoriAnalyzer(Builder builder) {

		this.version = builder.version;
		this.decompoundMode = builder.decompoundMode;
		this.stoptags = ModelTypeHelper.unmodifiable(builder.stoptags);
		this.userDictionary = builder.userDictionary;

	}

	public static NoriAnalyzer of(Function<Builder, ObjectBuilder<NoriAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
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
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code decompound_mode}
	 */
	@Nullable
	public final NoriDecompoundMode decompoundMode() {
		return this.decompoundMode;
	}

	/**
	 * API name: {@code stoptags}
	 */
	public final List<String> stoptags() {
		return this.stoptags;
	}

	/**
	 * API name: {@code user_dictionary}
	 */
	@Nullable
	public final String userDictionary() {
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

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.decompoundMode != null) {
			generator.writeKey("decompound_mode");
			this.decompoundMode.serialize(generator, mapper);
		}
		if (ModelTypeHelper.isDefined(this.stoptags)) {
			generator.writeKey("stoptags");
			generator.writeStartArray();
			for (String item0 : this.stoptags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.userDictionary != null) {
			generator.writeKey("user_dictionary");
			generator.write(this.userDictionary);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NoriAnalyzer}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NoriAnalyzer> {
		@Nullable
		private String version;

		@Nullable
		private NoriDecompoundMode decompoundMode;

		@Nullable
		private List<String> stoptags;

		@Nullable
		private String userDictionary;

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code decompound_mode}
		 */
		public final Builder decompoundMode(@Nullable NoriDecompoundMode value) {
			this.decompoundMode = value;
			return this;
		}

		/**
		 * API name: {@code stoptags}
		 */
		public final Builder stoptags(@Nullable List<String> value) {
			this.stoptags = value;
			return this;
		}

		/**
		 * API name: {@code stoptags}
		 */
		public final Builder stoptags(String... value) {
			this.stoptags = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code user_dictionary}
		 */
		public final Builder userDictionary(@Nullable String value) {
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
			_checkSingleUse();

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
