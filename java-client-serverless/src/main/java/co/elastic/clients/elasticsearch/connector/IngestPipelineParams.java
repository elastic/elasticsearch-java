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

package co.elastic.clients.elasticsearch.connector;

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
import java.lang.Boolean;
import java.lang.String;
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

// typedef: connector._types.IngestPipelineParams

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.IngestPipelineParams">API
 *      specification</a>
 */
@JsonpDeserializable
public class IngestPipelineParams implements JsonpSerializable {
	private final boolean extractBinaryContent;

	private final String name;

	private final boolean reduceWhitespace;

	private final boolean runMlInference;

	// ---------------------------------------------------------------------------------------------

	private IngestPipelineParams(Builder builder) {

		this.extractBinaryContent = ApiTypeHelper.requireNonNull(builder.extractBinaryContent, this,
				"extractBinaryContent");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.reduceWhitespace = ApiTypeHelper.requireNonNull(builder.reduceWhitespace, this, "reduceWhitespace");
		this.runMlInference = ApiTypeHelper.requireNonNull(builder.runMlInference, this, "runMlInference");

	}

	public static IngestPipelineParams of(Function<Builder, ObjectBuilder<IngestPipelineParams>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code extract_binary_content}
	 */
	public final boolean extractBinaryContent() {
		return this.extractBinaryContent;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code reduce_whitespace}
	 */
	public final boolean reduceWhitespace() {
		return this.reduceWhitespace;
	}

	/**
	 * Required - API name: {@code run_ml_inference}
	 */
	public final boolean runMlInference() {
		return this.runMlInference;
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

		generator.writeKey("extract_binary_content");
		generator.write(this.extractBinaryContent);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("reduce_whitespace");
		generator.write(this.reduceWhitespace);

		generator.writeKey("run_ml_inference");
		generator.write(this.runMlInference);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestPipelineParams}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IngestPipelineParams> {
		private Boolean extractBinaryContent;

		private String name;

		private Boolean reduceWhitespace;

		private Boolean runMlInference;

		/**
		 * Required - API name: {@code extract_binary_content}
		 */
		public final Builder extractBinaryContent(boolean value) {
			this.extractBinaryContent = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code reduce_whitespace}
		 */
		public final Builder reduceWhitespace(boolean value) {
			this.reduceWhitespace = value;
			return this;
		}

		/**
		 * Required - API name: {@code run_ml_inference}
		 */
		public final Builder runMlInference(boolean value) {
			this.runMlInference = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IngestPipelineParams}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IngestPipelineParams build() {
			_checkSingleUse();

			return new IngestPipelineParams(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IngestPipelineParams}
	 */
	public static final JsonpDeserializer<IngestPipelineParams> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IngestPipelineParams::setupIngestPipelineParamsDeserializer);

	protected static void setupIngestPipelineParamsDeserializer(ObjectDeserializer<IngestPipelineParams.Builder> op) {

		op.add(Builder::extractBinaryContent, JsonpDeserializer.booleanDeserializer(), "extract_binary_content");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::reduceWhitespace, JsonpDeserializer.booleanDeserializer(), "reduce_whitespace");
		op.add(Builder::runMlInference, JsonpDeserializer.booleanDeserializer(), "run_ml_inference");

	}

}
