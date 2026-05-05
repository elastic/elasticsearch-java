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

// typedef: inference._types.AlibabaCloudTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AlibabaCloudTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AlibabaCloudTaskSettings implements JsonpSerializable {
	@Nullable
	private final String inputType;

	@Nullable
	private final Boolean returnToken;

	// ---------------------------------------------------------------------------------------------

	private AlibabaCloudTaskSettings(Builder builder) {

		this.inputType = builder.inputType;
		this.returnToken = builder.returnToken;

	}

	public static AlibabaCloudTaskSettings of(Function<Builder, ObjectBuilder<AlibabaCloudTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>sparse_embedding</code> or <code>text_embedding</code> task,
	 * specify the type of input passed to the model. Valid values are:
	 * <ul>
	 * <li><code>ingest</code> for storing document embeddings in a vector
	 * database.</li>
	 * <li><code>search</code> for storing embeddings of search queries run against
	 * a vector database to find relevant documents.</li>
	 * </ul>
	 * <p>
	 * API name: {@code input_type}
	 */
	@Nullable
	public final String inputType() {
		return this.inputType;
	}

	/**
	 * For a <code>sparse_embedding</code> task, it affects whether the token name
	 * will be returned in the response. It defaults to <code>false</code>, which
	 * means only the token ID will be returned in the response.
	 * <p>
	 * API name: {@code return_token}
	 */
	@Nullable
	public final Boolean returnToken() {
		return this.returnToken;
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
			generator.write(this.inputType);

		}
		if (this.returnToken != null) {
			generator.writeKey("return_token");
			generator.write(this.returnToken);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AlibabaCloudTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AlibabaCloudTaskSettings> {
		@Nullable
		private String inputType;

		@Nullable
		private Boolean returnToken;

		public Builder() {
		}
		private Builder(AlibabaCloudTaskSettings instance) {
			this.inputType = instance.inputType;
			this.returnToken = instance.returnToken;

		}
		/**
		 * For a <code>sparse_embedding</code> or <code>text_embedding</code> task,
		 * specify the type of input passed to the model. Valid values are:
		 * <ul>
		 * <li><code>ingest</code> for storing document embeddings in a vector
		 * database.</li>
		 * <li><code>search</code> for storing embeddings of search queries run against
		 * a vector database to find relevant documents.</li>
		 * </ul>
		 * <p>
		 * API name: {@code input_type}
		 */
		public final Builder inputType(@Nullable String value) {
			this.inputType = value;
			return this;
		}

		/**
		 * For a <code>sparse_embedding</code> task, it affects whether the token name
		 * will be returned in the response. It defaults to <code>false</code>, which
		 * means only the token ID will be returned in the response.
		 * <p>
		 * API name: {@code return_token}
		 */
		public final Builder returnToken(@Nullable Boolean value) {
			this.returnToken = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AlibabaCloudTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AlibabaCloudTaskSettings build() {
			_checkSingleUse();

			return new AlibabaCloudTaskSettings(this);
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
	 * Json deserializer for {@link AlibabaCloudTaskSettings}
	 */
	public static final JsonpDeserializer<AlibabaCloudTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AlibabaCloudTaskSettings::setupAlibabaCloudTaskSettingsDeserializer);

	protected static void setupAlibabaCloudTaskSettingsDeserializer(
			ObjectDeserializer<AlibabaCloudTaskSettings.Builder> op) {

		op.add(Builder::inputType, JsonpDeserializer.stringDeserializer(), "input_type");
		op.add(Builder::returnToken, JsonpDeserializer.booleanDeserializer(), "return_token");

	}

}
