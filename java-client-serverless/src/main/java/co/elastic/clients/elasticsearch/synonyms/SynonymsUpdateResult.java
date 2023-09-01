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
import co.elastic.clients.elasticsearch.indices.reload_search_analyzers.ReloadResult;
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

// typedef: synonyms._types.SynonymsUpdateResult

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#synonyms._types.SynonymsUpdateResult">API
 *      specification</a>
 */

public abstract class SynonymsUpdateResult implements JsonpSerializable {
	private final Result result;

	private final ReloadResult reloadAnalyzersDetails;

	// ---------------------------------------------------------------------------------------------

	protected SynonymsUpdateResult(AbstractBuilder<?> builder) {

		this.result = ApiTypeHelper.requireNonNull(builder.result, this, "result");
		this.reloadAnalyzersDetails = ApiTypeHelper.requireNonNull(builder.reloadAnalyzersDetails, this,
				"reloadAnalyzersDetails");

	}

	/**
	 * Required - Update operation result
	 * <p>
	 * API name: {@code result}
	 */
	public final Result result() {
		return this.result;
	}

	/**
	 * Required - Updating synonyms in a synonym set reloads the associated
	 * analyzers. This is the analyzers reloading result
	 * <p>
	 * API name: {@code reload_analyzers_details}
	 */
	public final ReloadResult reloadAnalyzersDetails() {
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private Result result;

		private ReloadResult reloadAnalyzersDetails;

		/**
		 * Required - Update operation result
		 * <p>
		 * API name: {@code result}
		 */
		public final BuilderT result(Result value) {
			this.result = value;
			return self();
		}

		/**
		 * Required - Updating synonyms in a synonym set reloads the associated
		 * analyzers. This is the analyzers reloading result
		 * <p>
		 * API name: {@code reload_analyzers_details}
		 */
		public final BuilderT reloadAnalyzersDetails(ReloadResult value) {
			this.reloadAnalyzersDetails = value;
			return self();
		}

		/**
		 * Required - Updating synonyms in a synonym set reloads the associated
		 * analyzers. This is the analyzers reloading result
		 * <p>
		 * API name: {@code reload_analyzers_details}
		 */
		public final BuilderT reloadAnalyzersDetails(Function<ReloadResult.Builder, ObjectBuilder<ReloadResult>> fn) {
			return this.reloadAnalyzersDetails(fn.apply(new ReloadResult.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSynonymsUpdateResultDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::result, Result._DESERIALIZER, "result");
		op.add(AbstractBuilder::reloadAnalyzersDetails, ReloadResult._DESERIALIZER, "reload_analyzers_details");

	}

}
