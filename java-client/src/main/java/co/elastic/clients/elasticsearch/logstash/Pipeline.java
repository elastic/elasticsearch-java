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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: logstash._types.Pipeline
@JsonpDeserializable
public final class Pipeline implements JsonpSerializable {
	private final String description;

	private final String lastModified;

	private final PipelineMetadata pipelineMetadata;

	private final String username;

	private final String pipeline;

	private final PipelineSettings pipelineSettings;

	// ---------------------------------------------------------------------------------------------

	public Pipeline(Builder builder) {

		this.description = Objects.requireNonNull(builder.description, "description");
		this.lastModified = Objects.requireNonNull(builder.lastModified, "last_modified");
		this.pipelineMetadata = Objects.requireNonNull(builder.pipelineMetadata, "pipeline_metadata");
		this.username = Objects.requireNonNull(builder.username, "username");
		this.pipeline = Objects.requireNonNull(builder.pipeline, "pipeline");
		this.pipelineSettings = Objects.requireNonNull(builder.pipelineSettings, "pipeline_settings");

	}

	public Pipeline(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code last_modified}
	 */
	public String lastModified() {
		return this.lastModified;
	}

	/**
	 * API name: {@code pipeline_metadata}
	 */
	public PipelineMetadata pipelineMetadata() {
		return this.pipelineMetadata;
	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * API name: {@code pipeline}
	 */
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * API name: {@code pipeline_settings}
	 */
	public PipelineSettings pipelineSettings() {
		return this.pipelineSettings;
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

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("last_modified");
		generator.write(this.lastModified);

		generator.writeKey("pipeline_metadata");
		this.pipelineMetadata.serialize(generator, mapper);

		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("pipeline");
		generator.write(this.pipeline);

		generator.writeKey("pipeline_settings");
		this.pipelineSettings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Pipeline}.
	 */
	public static class Builder implements ObjectBuilder<Pipeline> {
		private String description;

		private String lastModified;

		private PipelineMetadata pipelineMetadata;

		private String username;

		private String pipeline;

		private PipelineSettings pipelineSettings;

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code last_modified}
		 */
		public Builder lastModified(String value) {
			this.lastModified = value;
			return this;
		}

		/**
		 * API name: {@code pipeline_metadata}
		 */
		public Builder pipelineMetadata(PipelineMetadata value) {
			this.pipelineMetadata = value;
			return this;
		}

		/**
		 * API name: {@code pipeline_metadata}
		 */
		public Builder pipelineMetadata(Function<PipelineMetadata.Builder, ObjectBuilder<PipelineMetadata>> fn) {
			return this.pipelineMetadata(fn.apply(new PipelineMetadata.Builder()).build());
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code pipeline_settings}
		 */
		public Builder pipelineSettings(PipelineSettings value) {
			this.pipelineSettings = value;
			return this;
		}

		/**
		 * API name: {@code pipeline_settings}
		 */
		public Builder pipelineSettings(Function<PipelineSettings.Builder, ObjectBuilder<PipelineSettings>> fn) {
			return this.pipelineSettings(fn.apply(new PipelineSettings.Builder()).build());
		}

		/**
		 * Builds a {@link Pipeline}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pipeline build() {

			return new Pipeline(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Pipeline}
	 */
	public static final JsonpDeserializer<Pipeline> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Pipeline::setupPipelineDeserializer, Builder::build);

	protected static void setupPipelineDeserializer(DelegatingDeserializer<Pipeline.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::lastModified, JsonpDeserializer.stringDeserializer(), "last_modified");
		op.add(Builder::pipelineMetadata, PipelineMetadata._DESERIALIZER, "pipeline_metadata");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");
		op.add(Builder::pipelineSettings, PipelineSettings._DESERIALIZER, "pipeline_settings");

	}

}
