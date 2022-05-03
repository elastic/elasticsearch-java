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

package co.elastic.clients.elasticsearch.logstash;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: logstash._types.PipelineSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#logstash._types.PipelineSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class PipelineSettings implements JsonpSerializable {
	private final int pipelineWorkers;

	private final int pipelineBatchSize;

	private final int pipelineBatchDelay;

	private final String queueType;

	private final int queueMaxBytesNumber;

	private final String queueMaxBytesUnits;

	private final int queueCheckpointWrites;

	// ---------------------------------------------------------------------------------------------

	private PipelineSettings(Builder builder) {

		this.pipelineWorkers = ApiTypeHelper.requireNonNull(builder.pipelineWorkers, this, "pipelineWorkers");
		this.pipelineBatchSize = ApiTypeHelper.requireNonNull(builder.pipelineBatchSize, this, "pipelineBatchSize");
		this.pipelineBatchDelay = ApiTypeHelper.requireNonNull(builder.pipelineBatchDelay, this, "pipelineBatchDelay");
		this.queueType = ApiTypeHelper.requireNonNull(builder.queueType, this, "queueType");
		this.queueMaxBytesNumber = ApiTypeHelper.requireNonNull(builder.queueMaxBytesNumber, this,
				"queueMaxBytesNumber");
		this.queueMaxBytesUnits = ApiTypeHelper.requireNonNull(builder.queueMaxBytesUnits, this, "queueMaxBytesUnits");
		this.queueCheckpointWrites = ApiTypeHelper.requireNonNull(builder.queueCheckpointWrites, this,
				"queueCheckpointWrites");

	}

	public static PipelineSettings of(Function<Builder, ObjectBuilder<PipelineSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code pipeline.workers}
	 */
	public final int pipelineWorkers() {
		return this.pipelineWorkers;
	}

	/**
	 * Required - API name: {@code pipeline.batch.size}
	 */
	public final int pipelineBatchSize() {
		return this.pipelineBatchSize;
	}

	/**
	 * Required - API name: {@code pipeline.batch.delay}
	 */
	public final int pipelineBatchDelay() {
		return this.pipelineBatchDelay;
	}

	/**
	 * Required - API name: {@code queue.type}
	 */
	public final String queueType() {
		return this.queueType;
	}

	/**
	 * Required - API name: {@code queue.max_bytes.number}
	 */
	public final int queueMaxBytesNumber() {
		return this.queueMaxBytesNumber;
	}

	/**
	 * Required - API name: {@code queue.max_bytes.units}
	 */
	public final String queueMaxBytesUnits() {
		return this.queueMaxBytesUnits;
	}

	/**
	 * Required - API name: {@code queue.checkpoint.writes}
	 */
	public final int queueCheckpointWrites() {
		return this.queueCheckpointWrites;
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

		generator.writeKey("pipeline.workers");
		generator.write(this.pipelineWorkers);

		generator.writeKey("pipeline.batch.size");
		generator.write(this.pipelineBatchSize);

		generator.writeKey("pipeline.batch.delay");
		generator.write(this.pipelineBatchDelay);

		generator.writeKey("queue.type");
		generator.write(this.queueType);

		generator.writeKey("queue.max_bytes.number");
		generator.write(this.queueMaxBytesNumber);

		generator.writeKey("queue.max_bytes.units");
		generator.write(this.queueMaxBytesUnits);

		generator.writeKey("queue.checkpoint.writes");
		generator.write(this.queueCheckpointWrites);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PipelineSettings> {
		private Integer pipelineWorkers;

		private Integer pipelineBatchSize;

		private Integer pipelineBatchDelay;

		private String queueType;

		private Integer queueMaxBytesNumber;

		private String queueMaxBytesUnits;

		private Integer queueCheckpointWrites;

		/**
		 * Required - API name: {@code pipeline.workers}
		 */
		public final Builder pipelineWorkers(int value) {
			this.pipelineWorkers = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipeline.batch.size}
		 */
		public final Builder pipelineBatchSize(int value) {
			this.pipelineBatchSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipeline.batch.delay}
		 */
		public final Builder pipelineBatchDelay(int value) {
			this.pipelineBatchDelay = value;
			return this;
		}

		/**
		 * Required - API name: {@code queue.type}
		 */
		public final Builder queueType(String value) {
			this.queueType = value;
			return this;
		}

		/**
		 * Required - API name: {@code queue.max_bytes.number}
		 */
		public final Builder queueMaxBytesNumber(int value) {
			this.queueMaxBytesNumber = value;
			return this;
		}

		/**
		 * Required - API name: {@code queue.max_bytes.units}
		 */
		public final Builder queueMaxBytesUnits(String value) {
			this.queueMaxBytesUnits = value;
			return this;
		}

		/**
		 * Required - API name: {@code queue.checkpoint.writes}
		 */
		public final Builder queueCheckpointWrites(int value) {
			this.queueCheckpointWrites = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PipelineSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineSettings build() {
			_checkSingleUse();

			return new PipelineSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PipelineSettings}
	 */
	public static final JsonpDeserializer<PipelineSettings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PipelineSettings::setupPipelineSettingsDeserializer);

	protected static void setupPipelineSettingsDeserializer(ObjectDeserializer<PipelineSettings.Builder> op) {

		op.add(Builder::pipelineWorkers, JsonpDeserializer.integerDeserializer(), "pipeline.workers");
		op.add(Builder::pipelineBatchSize, JsonpDeserializer.integerDeserializer(), "pipeline.batch.size");
		op.add(Builder::pipelineBatchDelay, JsonpDeserializer.integerDeserializer(), "pipeline.batch.delay");
		op.add(Builder::queueType, JsonpDeserializer.stringDeserializer(), "queue.type");
		op.add(Builder::queueMaxBytesNumber, JsonpDeserializer.integerDeserializer(), "queue.max_bytes.number");
		op.add(Builder::queueMaxBytesUnits, JsonpDeserializer.stringDeserializer(), "queue.max_bytes.units");
		op.add(Builder::queueCheckpointWrites, JsonpDeserializer.integerDeserializer(), "queue.checkpoint.writes");

	}

}
