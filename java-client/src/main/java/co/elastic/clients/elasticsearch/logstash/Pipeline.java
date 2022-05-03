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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: logstash._types.Pipeline

/**
 *
 * @see <a href="../doc-files/api-spec.html#logstash._types.Pipeline">API
 *      specification</a>
 */
@JsonpDeserializable
public class Pipeline implements JsonpSerializable {
	private final String description;

	private final DateTime lastModified;

	private final PipelineMetadata pipelineMetadata;

	private final String username;

	private final String pipeline;

	private final PipelineSettings pipelineSettings;

	// ---------------------------------------------------------------------------------------------

	private Pipeline(Builder builder) {

		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.lastModified = ApiTypeHelper.requireNonNull(builder.lastModified, this, "lastModified");
		this.pipelineMetadata = ApiTypeHelper.requireNonNull(builder.pipelineMetadata, this, "pipelineMetadata");
		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");
		this.pipeline = ApiTypeHelper.requireNonNull(builder.pipeline, this, "pipeline");
		this.pipelineSettings = ApiTypeHelper.requireNonNull(builder.pipelineSettings, this, "pipelineSettings");

	}

	public static Pipeline of(Function<Builder, ObjectBuilder<Pipeline>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code last_modified}
	 */
	public final DateTime lastModified() {
		return this.lastModified;
	}

	/**
	 * Required - API name: {@code pipeline_metadata}
	 */
	public final PipelineMetadata pipelineMetadata() {
		return this.pipelineMetadata;
	}

	/**
	 * Required - API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * Required - API name: {@code pipeline}
	 */
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * Required - API name: {@code pipeline_settings}
	 */
	public final PipelineSettings pipelineSettings() {
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
		this.lastModified.serialize(generator, mapper);
		generator.writeKey("pipeline_metadata");
		this.pipelineMetadata.serialize(generator, mapper);

		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("pipeline");
		generator.write(this.pipeline);

		generator.writeKey("pipeline_settings");
		this.pipelineSettings.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Pipeline}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Pipeline> {
		private String description;

		private DateTime lastModified;

		private PipelineMetadata pipelineMetadata;

		private String username;

		private String pipeline;

		private PipelineSettings pipelineSettings;

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code last_modified}
		 */
		public final Builder lastModified(DateTime value) {
			this.lastModified = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipeline_metadata}
		 */
		public final Builder pipelineMetadata(PipelineMetadata value) {
			this.pipelineMetadata = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipeline_metadata}
		 */
		public final Builder pipelineMetadata(Function<PipelineMetadata.Builder, ObjectBuilder<PipelineMetadata>> fn) {
			return this.pipelineMetadata(fn.apply(new PipelineMetadata.Builder()).build());
		}

		/**
		 * Required - API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipeline}
		 */
		public final Builder pipeline(String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipeline_settings}
		 */
		public final Builder pipelineSettings(PipelineSettings value) {
			this.pipelineSettings = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipeline_settings}
		 */
		public final Builder pipelineSettings(Function<PipelineSettings.Builder, ObjectBuilder<PipelineSettings>> fn) {
			return this.pipelineSettings(fn.apply(new PipelineSettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Pipeline}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pipeline build() {
			_checkSingleUse();

			return new Pipeline(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Pipeline}
	 */
	public static final JsonpDeserializer<Pipeline> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Pipeline::setupPipelineDeserializer);

	protected static void setupPipelineDeserializer(ObjectDeserializer<Pipeline.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::lastModified, DateTime._DESERIALIZER, "last_modified");
		op.add(Builder::pipelineMetadata, PipelineMetadata._DESERIALIZER, "pipeline_metadata");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");
		op.add(Builder::pipelineSettings, PipelineSettings._DESERIALIZER, "pipeline_settings");

	}

}
