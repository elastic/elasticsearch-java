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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: inference._types.NvidiaTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.NvidiaTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class NvidiaTaskSettings implements JsonpSerializable {
	@Nullable
	private final NvidiaInputType inputType;

	@Nullable
	private final CohereTruncateType truncate;

	// ---------------------------------------------------------------------------------------------

	private NvidiaTaskSettings(Builder builder) {

		this.inputType = builder.inputType;
		this.truncate = builder.truncate;

	}

	public static NvidiaTaskSettings of(Function<Builder, ObjectBuilder<NvidiaTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>text_embedding</code> task, type of input sent to the Nvidia
	 * endpoint. Valid values are:
	 * <ul>
	 * <li><code>ingest</code>: Mapped to Nvidia's <code>passage</code> value in
	 * request. Used when generating embeddings during indexing.</li>
	 * <li><code>search</code>: Mapped to Nvidia's <code>query</code> value in
	 * request. Used when generating embeddings during querying.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: For Nvidia endpoints, if the <code>input_type</code> field is not
	 * specified, it defaults to <code>query</code>.
	 * <p>
	 * API name: {@code input_type}
	 */
	@Nullable
	public final NvidiaInputType inputType() {
		return this.inputType;
	}

	/**
	 * For a <code>text_embedding</code> task, the method used by the Nvidia model
	 * to handle inputs longer than the maximum token length. Valid values are:
	 * <ul>
	 * <li><code>END</code>: When the input exceeds the maximum input token length,
	 * the end of the input is discarded.</li>
	 * <li><code>NONE</code>: When the input exceeds the maximum input token length,
	 * an error is returned.</li>
	 * <li><code>START</code>: When the input exceeds the maximum input token
	 * length, the start of the input is discarded.</li>
	 * </ul>
	 * <p>
	 * API name: {@code truncate}
	 */
	@Nullable
	public final CohereTruncateType truncate() {
		return this.truncate;
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

		if (this.inputType != null) {
			generator.writeKey("input_type");
			this.inputType.serialize(generator, mapper);
		}
		if (this.truncate != null) {
			generator.writeKey("truncate");
			this.truncate.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NvidiaTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NvidiaTaskSettings> {
		@Nullable
		private NvidiaInputType inputType;

		@Nullable
		private CohereTruncateType truncate;

		public Builder() {
		}
		private Builder(NvidiaTaskSettings instance) {
			this.inputType = instance.inputType;
			this.truncate = instance.truncate;

		}
		/**
		 * For a <code>text_embedding</code> task, type of input sent to the Nvidia
		 * endpoint. Valid values are:
		 * <ul>
		 * <li><code>ingest</code>: Mapped to Nvidia's <code>passage</code> value in
		 * request. Used when generating embeddings during indexing.</li>
		 * <li><code>search</code>: Mapped to Nvidia's <code>query</code> value in
		 * request. Used when generating embeddings during querying.</li>
		 * </ul>
		 * <p>
		 * IMPORTANT: For Nvidia endpoints, if the <code>input_type</code> field is not
		 * specified, it defaults to <code>query</code>.
		 * <p>
		 * API name: {@code input_type}
		 */
		public final Builder inputType(@Nullable NvidiaInputType value) {
			this.inputType = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, the method used by the Nvidia model
		 * to handle inputs longer than the maximum token length. Valid values are:
		 * <ul>
		 * <li><code>END</code>: When the input exceeds the maximum input token length,
		 * the end of the input is discarded.</li>
		 * <li><code>NONE</code>: When the input exceeds the maximum input token length,
		 * an error is returned.</li>
		 * <li><code>START</code>: When the input exceeds the maximum input token
		 * length, the start of the input is discarded.</li>
		 * </ul>
		 * <p>
		 * API name: {@code truncate}
		 */
		public final Builder truncate(@Nullable CohereTruncateType value) {
			this.truncate = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NvidiaTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NvidiaTaskSettings build() {
			_checkSingleUse();

			return new NvidiaTaskSettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NvidiaTaskSettings}
	 */
	public static final JsonpDeserializer<NvidiaTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NvidiaTaskSettings::setupNvidiaTaskSettingsDeserializer);

	protected static void setupNvidiaTaskSettingsDeserializer(ObjectDeserializer<NvidiaTaskSettings.Builder> op) {

		op.add(Builder::inputType, NvidiaInputType._DESERIALIZER, "input_type");
		op.add(Builder::truncate, CohereTruncateType._DESERIALIZER, "truncate");

	}

}
