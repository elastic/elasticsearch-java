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

package co.elastic.clients.elasticsearch.synonyms;

import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.elasticsearch.indices.reload_search_analyzers.ReloadDetails;
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

// typedef: synonyms.put_synonym.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#synonyms.put_synonym.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutSynonymResponse implements JsonpSerializable {
	private final Result result;

	private final ReloadDetails reloadAnalyzersDetails;

	// ---------------------------------------------------------------------------------------------

	private PutSynonymResponse(Builder builder) {

		this.result = ApiTypeHelper.requireNonNull(builder.result, this, "result");
		this.reloadAnalyzersDetails = ApiTypeHelper.requireNonNull(builder.reloadAnalyzersDetails, this,
				"reloadAnalyzersDetails");

	}

	public static PutSynonymResponse of(Function<Builder, ObjectBuilder<PutSynonymResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code result}
	 */
	public final Result result() {
		return this.result;
	}

	/**
	 * Required - API name: {@code reload_analyzers_details}
	 */
	public final ReloadDetails reloadAnalyzersDetails() {
		return this.reloadAnalyzersDetails;
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

		generator.writeKey("result");
		this.result.serialize(generator, mapper);
		generator.writeKey("reload_analyzers_details");
		this.reloadAnalyzersDetails.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSynonymResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PutSynonymResponse> {
		private Result result;

		private ReloadDetails reloadAnalyzersDetails;

		/**
		 * Required - API name: {@code result}
		 */
		public final Builder result(Result value) {
			this.result = value;
			return this;
		}

		/**
		 * Required - API name: {@code reload_analyzers_details}
		 */
		public final Builder reloadAnalyzersDetails(ReloadDetails value) {
			this.reloadAnalyzersDetails = value;
			return this;
		}

		/**
		 * Required - API name: {@code reload_analyzers_details}
		 */
		public final Builder reloadAnalyzersDetails(Function<ReloadDetails.Builder, ObjectBuilder<ReloadDetails>> fn) {
			return this.reloadAnalyzersDetails(fn.apply(new ReloadDetails.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutSynonymResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSynonymResponse build() {
			_checkSingleUse();

			return new PutSynonymResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutSynonymResponse}
	 */
	public static final JsonpDeserializer<PutSynonymResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutSynonymResponse::setupPutSynonymResponseDeserializer);

	protected static void setupPutSynonymResponseDeserializer(ObjectDeserializer<PutSynonymResponse.Builder> op) {

		op.add(Builder::result, Result._DESERIALIZER, "result");
		op.add(Builder::reloadAnalyzersDetails, ReloadDetails._DESERIALIZER, "reload_analyzers_details");

	}

}
