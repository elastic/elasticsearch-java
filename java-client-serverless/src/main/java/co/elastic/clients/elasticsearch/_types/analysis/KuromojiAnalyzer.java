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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.KuromojiAnalyzer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.KuromojiAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class KuromojiAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final KuromojiTokenizationMode mode;

	@Nullable
	private final String userDictionary;

	// ---------------------------------------------------------------------------------------------

	private KuromojiAnalyzer(Builder builder) {

		this.mode = ApiTypeHelper.requireNonNull(builder.mode, this, "mode");
		this.userDictionary = builder.userDictionary;

	}

	public static KuromojiAnalyzer of(Function<Builder, ObjectBuilder<KuromojiAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.Kuromoji;
	}

	/**
	 * Required - API name: {@code mode}
	 */
	public final KuromojiTokenizationMode mode() {
		return this.mode;
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

		generator.write("type", "kuromoji");

		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);
		if (this.userDictionary != null) {
			generator.writeKey("user_dictionary");
			generator.write(this.userDictionary);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KuromojiAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<KuromojiAnalyzer> {
		private KuromojiTokenizationMode mode;

		@Nullable
		private String userDictionary;

		/**
		 * Required - API name: {@code mode}
		 */
		public final Builder mode(KuromojiTokenizationMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code user_dictionary}
		 */
		public final Builder userDictionary(@Nullable String value) {
			this.userDictionary = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KuromojiAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KuromojiAnalyzer build() {
			_checkSingleUse();

			return new KuromojiAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KuromojiAnalyzer}
	 */
	public static final JsonpDeserializer<KuromojiAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KuromojiAnalyzer::setupKuromojiAnalyzerDeserializer);

	protected static void setupKuromojiAnalyzerDeserializer(ObjectDeserializer<KuromojiAnalyzer.Builder> op) {

		op.add(Builder::mode, KuromojiTokenizationMode._DESERIALIZER, "mode");
		op.add(Builder::userDictionary, JsonpDeserializer.stringDeserializer(), "user_dictionary");

		op.ignore("type");
	}

}
