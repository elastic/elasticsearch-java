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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: nodes._types.IngestStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.IngestStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class IngestStats implements JsonpSerializable {
	private final long count;

	private final long current;

	private final long failed;

	private final List<Map<String, KeyedProcessor>> processors;

	private final long timeInMillis;

	private final long ingestedAsFirstPipelineInBytes;

	private final long producedAsFirstPipelineInBytes;

	// ---------------------------------------------------------------------------------------------

	private IngestStats(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.current = ApiTypeHelper.requireNonNull(builder.current, this, "current");
		this.failed = ApiTypeHelper.requireNonNull(builder.failed, this, "failed");
		this.processors = ApiTypeHelper.unmodifiableRequired(builder.processors, this, "processors");
		this.timeInMillis = ApiTypeHelper.requireNonNull(builder.timeInMillis, this, "timeInMillis");
		this.ingestedAsFirstPipelineInBytes = ApiTypeHelper.requireNonNull(builder.ingestedAsFirstPipelineInBytes, this,
				"ingestedAsFirstPipelineInBytes");
		this.producedAsFirstPipelineInBytes = ApiTypeHelper.requireNonNull(builder.producedAsFirstPipelineInBytes, this,
				"producedAsFirstPipelineInBytes");

	}

	public static IngestStats of(Function<Builder, ObjectBuilder<IngestStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Total number of documents ingested during the lifetime of this
	 * node.
	 * <p>
	 * API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - Total number of documents currently being ingested.
	 * <p>
	 * API name: {@code current}
	 */
	public final long current() {
		return this.current;
	}

	/**
	 * Required - Total number of failed ingest operations during the lifetime of
	 * this node.
	 * <p>
	 * API name: {@code failed}
	 */
	public final long failed() {
		return this.failed;
	}

	/**
	 * Required - Total number of ingest processors.
	 * <p>
	 * API name: {@code processors}
	 */
	public final List<Map<String, KeyedProcessor>> processors() {
		return this.processors;
	}

	/**
	 * Required - Total time, in milliseconds, spent preprocessing ingest documents
	 * during the lifetime of this node.
	 * <p>
	 * API name: {@code time_in_millis}
	 */
	public final long timeInMillis() {
		return this.timeInMillis;
	}

	/**
	 * Required - Total number of bytes of all documents ingested by the pipeline.
	 * This field is only present on pipelines which are the first to process a
	 * document. Thus, it is not present on pipelines which only serve as a final
	 * pipeline after a default pipeline, a pipeline run after a reroute processor,
	 * or pipelines in pipeline processors.
	 * <p>
	 * API name: {@code ingested_as_first_pipeline_in_bytes}
	 */
	public final long ingestedAsFirstPipelineInBytes() {
		return this.ingestedAsFirstPipelineInBytes;
	}

	/**
	 * Required - Total number of bytes of all documents produced by the pipeline.
	 * This field is only present on pipelines which are the first to process a
	 * document. Thus, it is not present on pipelines which only serve as a final
	 * pipeline after a default pipeline, a pipeline run after a reroute processor,
	 * or pipelines in pipeline processors. In situations where there are subsequent
	 * pipelines, the value represents the size of the document after all pipelines
	 * have run.
	 * <p>
	 * API name: {@code produced_as_first_pipeline_in_bytes}
	 */
	public final long producedAsFirstPipelineInBytes() {
		return this.producedAsFirstPipelineInBytes;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("current");
		generator.write(this.current);

		generator.writeKey("failed");
		generator.write(this.failed);

		if (ApiTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (Map<String, KeyedProcessor> item0 : this.processors) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, KeyedProcessor> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("time_in_millis");
		generator.write(this.timeInMillis);

		generator.writeKey("ingested_as_first_pipeline_in_bytes");
		generator.write(this.ingestedAsFirstPipelineInBytes);

		generator.writeKey("produced_as_first_pipeline_in_bytes");
		generator.write(this.producedAsFirstPipelineInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IngestStats> {
		private Long count;

		private Long current;

		private Long failed;

		private List<Map<String, KeyedProcessor>> processors;

		private Long timeInMillis;

		private Long ingestedAsFirstPipelineInBytes;

		private Long producedAsFirstPipelineInBytes;

		/**
		 * Required - Total number of documents ingested during the lifetime of this
		 * node.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Total number of documents currently being ingested.
		 * <p>
		 * API name: {@code current}
		 */
		public final Builder current(long value) {
			this.current = value;
			return this;
		}

		/**
		 * Required - Total number of failed ingest operations during the lifetime of
		 * this node.
		 * <p>
		 * API name: {@code failed}
		 */
		public final Builder failed(long value) {
			this.failed = value;
			return this;
		}

		/**
		 * Required - Total number of ingest processors.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>processors</code>.
		 */
		public final Builder processors(List<Map<String, KeyedProcessor>> list) {
			this.processors = _listAddAll(this.processors, list);
			return this;
		}

		/**
		 * Required - Total number of ingest processors.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds one or more values to <code>processors</code>.
		 */
		public final Builder processors(Map<String, KeyedProcessor> value, Map<String, KeyedProcessor>... values) {
			this.processors = _listAdd(this.processors, value, values);
			return this;
		}

		/**
		 * Required - Total time, in milliseconds, spent preprocessing ingest documents
		 * during the lifetime of this node.
		 * <p>
		 * API name: {@code time_in_millis}
		 */
		public final Builder timeInMillis(long value) {
			this.timeInMillis = value;
			return this;
		}

		/**
		 * Required - Total number of bytes of all documents ingested by the pipeline.
		 * This field is only present on pipelines which are the first to process a
		 * document. Thus, it is not present on pipelines which only serve as a final
		 * pipeline after a default pipeline, a pipeline run after a reroute processor,
		 * or pipelines in pipeline processors.
		 * <p>
		 * API name: {@code ingested_as_first_pipeline_in_bytes}
		 */
		public final Builder ingestedAsFirstPipelineInBytes(long value) {
			this.ingestedAsFirstPipelineInBytes = value;
			return this;
		}

		/**
		 * Required - Total number of bytes of all documents produced by the pipeline.
		 * This field is only present on pipelines which are the first to process a
		 * document. Thus, it is not present on pipelines which only serve as a final
		 * pipeline after a default pipeline, a pipeline run after a reroute processor,
		 * or pipelines in pipeline processors. In situations where there are subsequent
		 * pipelines, the value represents the size of the document after all pipelines
		 * have run.
		 * <p>
		 * API name: {@code produced_as_first_pipeline_in_bytes}
		 */
		public final Builder producedAsFirstPipelineInBytes(long value) {
			this.producedAsFirstPipelineInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IngestStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IngestStats build() {
			_checkSingleUse();

			return new IngestStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IngestStats}
	 */
	public static final JsonpDeserializer<IngestStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IngestStats::setupIngestStatsDeserializer);

	protected static void setupIngestStatsDeserializer(ObjectDeserializer<IngestStats.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::current, JsonpDeserializer.longDeserializer(), "current");
		op.add(Builder::failed, JsonpDeserializer.longDeserializer(), "failed");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(KeyedProcessor._DESERIALIZER)), "processors");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");
		op.add(Builder::ingestedAsFirstPipelineInBytes, JsonpDeserializer.longDeserializer(),
				"ingested_as_first_pipeline_in_bytes");
		op.add(Builder::producedAsFirstPipelineInBytes, JsonpDeserializer.longDeserializer(),
				"produced_as_first_pipeline_in_bytes");

	}

}
