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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.IcuAnalyzer

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.analysis.IcuAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class IcuAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final IcuNormalizationType method;

	private final IcuNormalizationMode mode;

	// ---------------------------------------------------------------------------------------------

	private IcuAnalyzer(Builder builder) {

		this.method = ApiTypeHelper.requireNonNull(builder.method, this, "method");
		this.mode = ApiTypeHelper.requireNonNull(builder.mode, this, "mode");

	}

	public static IcuAnalyzer of(Function<Builder, ObjectBuilder<IcuAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.IcuAnalyzer;
	}

	/**
	 * Required - API name: {@code method}
	 */
	public final IcuNormalizationType method() {
		return this.method;
	}

	/**
	 * Required - API name: {@code mode}
	 */
	public final IcuNormalizationMode mode() {
		return this.mode;
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

		generator.write("type", "icu_analyzer");

		generator.writeKey("method");
		this.method.serialize(generator, mapper);
		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IcuAnalyzer> {
		private IcuNormalizationType method;

		private IcuNormalizationMode mode;

		/**
		 * Required - API name: {@code method}
		 */
		public final Builder method(IcuNormalizationType value) {
			this.method = value;
			return this;
		}

		/**
		 * Required - API name: {@code mode}
		 */
		public final Builder mode(IcuNormalizationMode value) {
			this.mode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuAnalyzer build() {
			_checkSingleUse();

			return new IcuAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuAnalyzer}
	 */
	public static final JsonpDeserializer<IcuAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IcuAnalyzer::setupIcuAnalyzerDeserializer);

	protected static void setupIcuAnalyzerDeserializer(ObjectDeserializer<IcuAnalyzer.Builder> op) {

		op.add(Builder::method, IcuNormalizationType._DESERIALIZER, "method");
		op.add(Builder::mode, IcuNormalizationMode._DESERIALIZER, "mode");

		op.ignore("type");
	}

}
