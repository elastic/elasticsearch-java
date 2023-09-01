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

package co.elastic.clients.elasticsearch.ingest;

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

// typedef: ingest.processor_grok.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest.processor_grok.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ProcessorGrokResponse implements JsonpSerializable {
	private final Map<String, String> patterns;

	// ---------------------------------------------------------------------------------------------

	private ProcessorGrokResponse(Builder builder) {

		this.patterns = ApiTypeHelper.unmodifiableRequired(builder.patterns, this, "patterns");

	}

	public static ProcessorGrokResponse of(Function<Builder, ObjectBuilder<ProcessorGrokResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code patterns}
	 */
	public final Map<String, String> patterns() {
		return this.patterns;
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

		if (ApiTypeHelper.isDefined(this.patterns)) {
			generator.writeKey("patterns");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.patterns.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link ProcessorGrokResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ProcessorGrokResponse> {
		private Map<String, String> patterns;

		/**
		 * Required - API name: {@code patterns}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>patterns</code>.
		 */
		public final Builder patterns(Map<String, String> map) {
			this.patterns = _mapPutAll(this.patterns, map);
			return this;
		}

		/**
		 * Required - API name: {@code patterns}
		 * <p>
		 * Adds an entry to <code>patterns</code>.
		 */
		public final Builder patterns(String key, String value) {
			this.patterns = _mapPut(this.patterns, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ProcessorGrokResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ProcessorGrokResponse build() {
			_checkSingleUse();

			return new ProcessorGrokResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ProcessorGrokResponse}
	 */
	public static final JsonpDeserializer<ProcessorGrokResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ProcessorGrokResponse::setupProcessorGrokResponseDeserializer);

	protected static void setupProcessorGrokResponseDeserializer(ObjectDeserializer<ProcessorGrokResponse.Builder> op) {

		op.add(Builder::patterns, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");

	}

}
