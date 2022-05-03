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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch.ilm.explain_lifecycle.LifecycleExplain;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm.explain_lifecycle.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExplainLifecycleResponse implements JsonpSerializable {
	private final Map<String, LifecycleExplain> indices;

	// ---------------------------------------------------------------------------------------------

	private ExplainLifecycleResponse(Builder builder) {

		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static ExplainLifecycleResponse of(Function<Builder, ObjectBuilder<ExplainLifecycleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final Map<String, LifecycleExplain> indices() {
		return this.indices;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, LifecycleExplain> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainLifecycleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExplainLifecycleResponse> {
		private Map<String, LifecycleExplain> indices;

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indices</code>.
		 */
		public final Builder indices(Map<String, LifecycleExplain> map) {
			this.indices = _mapPutAll(this.indices, map);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code>.
		 */
		public final Builder indices(String key, LifecycleExplain value) {
			this.indices = _mapPut(this.indices, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(String key,
				Function<LifecycleExplain.Builder, ObjectBuilder<LifecycleExplain>> fn) {
			return indices(key, fn.apply(new LifecycleExplain.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExplainLifecycleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainLifecycleResponse build() {
			_checkSingleUse();

			return new ExplainLifecycleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExplainLifecycleResponse}
	 */
	public static final JsonpDeserializer<ExplainLifecycleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExplainLifecycleResponse::setupExplainLifecycleResponseDeserializer);

	protected static void setupExplainLifecycleResponseDeserializer(
			ObjectDeserializer<ExplainLifecycleResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(LifecycleExplain._DESERIALIZER), "indices");

	}

}
