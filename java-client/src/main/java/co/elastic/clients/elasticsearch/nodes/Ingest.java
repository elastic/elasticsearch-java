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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Ingest

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/nodes/_types/Stats.ts#L49-L52">API
 *      specification</a>
 */
@JsonpDeserializable
public class Ingest implements JsonpSerializable {
	private final Map<String, IngestTotal> pipelines;

	private final IngestTotal total;

	// ---------------------------------------------------------------------------------------------

	private Ingest(Builder builder) {

		this.pipelines = ApiTypeHelper.unmodifiableRequired(builder.pipelines, this, "pipelines");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static Ingest of(Function<Builder, ObjectBuilder<Ingest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code pipelines}
	 */
	public final Map<String, IngestTotal> pipelines() {
		return this.pipelines;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final IngestTotal total() {
		return this.total;
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

		if (ApiTypeHelper.isDefined(this.pipelines)) {
			generator.writeKey("pipelines");
			generator.writeStartObject();
			for (Map.Entry<String, IngestTotal> item0 : this.pipelines.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("total");
		this.total.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ingest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Ingest> {
		private Map<String, IngestTotal> pipelines;

		private IngestTotal total;

		/**
		 * Required - API name: {@code pipelines}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>pipelines</code>.
		 */
		public final Builder pipelines(Map<String, IngestTotal> map) {
			this.pipelines = _mapPutAll(this.pipelines, map);
			return this;
		}

		/**
		 * Required - API name: {@code pipelines}
		 * <p>
		 * Adds an entry to <code>pipelines</code>.
		 */
		public final Builder pipelines(String key, IngestTotal value) {
			this.pipelines = _mapPut(this.pipelines, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code pipelines}
		 * <p>
		 * Adds an entry to <code>pipelines</code> using a builder lambda.
		 */
		public final Builder pipelines(String key, Function<IngestTotal.Builder, ObjectBuilder<IngestTotal>> fn) {
			return pipelines(key, fn.apply(new IngestTotal.Builder()).build());
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(IngestTotal value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Function<IngestTotal.Builder, ObjectBuilder<IngestTotal>> fn) {
			return this.total(fn.apply(new IngestTotal.Builder()).build());
		}

		/**
		 * Builds a {@link Ingest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ingest build() {
			_checkSingleUse();

			return new Ingest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Ingest}
	 */
	public static final JsonpDeserializer<Ingest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Ingest::setupIngestDeserializer);

	protected static void setupIngestDeserializer(ObjectDeserializer<Ingest.Builder> op) {

		op.add(Builder::pipelines, JsonpDeserializer.stringMapDeserializer(IngestTotal._DESERIALIZER), "pipelines");
		op.add(Builder::total, IngestTotal._DESERIALIZER, "total");

	}

}
