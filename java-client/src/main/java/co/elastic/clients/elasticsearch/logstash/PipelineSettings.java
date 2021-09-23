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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: logstash._types.PipelineSettings
public final class PipelineSettings implements JsonpSerializable {
	private final Number pipeline_workers;

	private final Number pipeline_batch_size;

	private final Number pipeline_batch_delay;

	private final String queue_type;

	private final Number queue_maxBytes_number;

	private final String queue_maxBytes_units;

	private final Number queue_checkpoint_writes;

	// ---------------------------------------------------------------------------------------------

	public PipelineSettings(Builder builder) {

		this.pipeline_workers = Objects.requireNonNull(builder.pipeline_workers, "pipeline.workers");
		this.pipeline_batch_size = Objects.requireNonNull(builder.pipeline_batch_size, "pipeline.batch.size");
		this.pipeline_batch_delay = Objects.requireNonNull(builder.pipeline_batch_delay, "pipeline.batch.delay");
		this.queue_type = Objects.requireNonNull(builder.queue_type, "queue.type");
		this.queue_maxBytes_number = Objects.requireNonNull(builder.queue_maxBytes_number, "queue.max_bytes.number");
		this.queue_maxBytes_units = Objects.requireNonNull(builder.queue_maxBytes_units, "queue.max_bytes.units");
		this.queue_checkpoint_writes = Objects.requireNonNull(builder.queue_checkpoint_writes,
				"queue.checkpoint.writes");

	}

	/**
	 * API name: {@code pipeline.workers}
	 */
	public Number pipeline_workers() {
		return this.pipeline_workers;
	}

	/**
	 * API name: {@code pipeline.batch.size}
	 */
	public Number pipeline_batch_size() {
		return this.pipeline_batch_size;
	}

	/**
	 * API name: {@code pipeline.batch.delay}
	 */
	public Number pipeline_batch_delay() {
		return this.pipeline_batch_delay;
	}

	/**
	 * API name: {@code queue.type}
	 */
	public String queue_type() {
		return this.queue_type;
	}

	/**
	 * API name: {@code queue.max_bytes.number}
	 */
	public Number queue_maxBytes_number() {
		return this.queue_maxBytes_number;
	}

	/**
	 * API name: {@code queue.max_bytes.units}
	 */
	public String queue_maxBytes_units() {
		return this.queue_maxBytes_units;
	}

	/**
	 * API name: {@code queue.checkpoint.writes}
	 */
	public Number queue_checkpoint_writes() {
		return this.queue_checkpoint_writes;
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
		generator.write(this.pipeline_workers.doubleValue());

		generator.writeKey("pipeline.batch.size");
		generator.write(this.pipeline_batch_size.doubleValue());

		generator.writeKey("pipeline.batch.delay");
		generator.write(this.pipeline_batch_delay.doubleValue());

		generator.writeKey("queue.type");
		generator.write(this.queue_type);

		generator.writeKey("queue.max_bytes.number");
		generator.write(this.queue_maxBytes_number.doubleValue());

		generator.writeKey("queue.max_bytes.units");
		generator.write(this.queue_maxBytes_units);

		generator.writeKey("queue.checkpoint.writes");
		generator.write(this.queue_checkpoint_writes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineSettings}.
	 */
	public static class Builder implements ObjectBuilder<PipelineSettings> {
		private Number pipeline_workers;

		private Number pipeline_batch_size;

		private Number pipeline_batch_delay;

		private String queue_type;

		private Number queue_maxBytes_number;

		private String queue_maxBytes_units;

		private Number queue_checkpoint_writes;

		/**
		 * API name: {@code pipeline.workers}
		 */
		public Builder pipeline_workers(Number value) {
			this.pipeline_workers = value;
			return this;
		}

		/**
		 * API name: {@code pipeline.batch.size}
		 */
		public Builder pipeline_batch_size(Number value) {
			this.pipeline_batch_size = value;
			return this;
		}

		/**
		 * API name: {@code pipeline.batch.delay}
		 */
		public Builder pipeline_batch_delay(Number value) {
			this.pipeline_batch_delay = value;
			return this;
		}

		/**
		 * API name: {@code queue.type}
		 */
		public Builder queue_type(String value) {
			this.queue_type = value;
			return this;
		}

		/**
		 * API name: {@code queue.max_bytes.number}
		 */
		public Builder queue_maxBytes_number(Number value) {
			this.queue_maxBytes_number = value;
			return this;
		}

		/**
		 * API name: {@code queue.max_bytes.units}
		 */
		public Builder queue_maxBytes_units(String value) {
			this.queue_maxBytes_units = value;
			return this;
		}

		/**
		 * API name: {@code queue.checkpoint.writes}
		 */
		public Builder queue_checkpoint_writes(Number value) {
			this.queue_checkpoint_writes = value;
			return this;
		}

		/**
		 * Builds a {@link PipelineSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineSettings build() {

			return new PipelineSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PipelineSettings}
	 */
	public static final JsonpDeserializer<PipelineSettings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PipelineSettings::setupPipelineSettingsDeserializer);

	protected static void setupPipelineSettingsDeserializer(DelegatingDeserializer<PipelineSettings.Builder> op) {

		op.add(Builder::pipeline_workers, JsonpDeserializer.numberDeserializer(), "pipeline.workers");
		op.add(Builder::pipeline_batch_size, JsonpDeserializer.numberDeserializer(), "pipeline.batch.size");
		op.add(Builder::pipeline_batch_delay, JsonpDeserializer.numberDeserializer(), "pipeline.batch.delay");
		op.add(Builder::queue_type, JsonpDeserializer.stringDeserializer(), "queue.type");
		op.add(Builder::queue_maxBytes_number, JsonpDeserializer.numberDeserializer(), "queue.max_bytes.number");
		op.add(Builder::queue_maxBytes_units, JsonpDeserializer.stringDeserializer(), "queue.max_bytes.units");
		op.add(Builder::queue_checkpoint_writes, JsonpDeserializer.numberDeserializer(), "queue.checkpoint.writes");

	}

}
