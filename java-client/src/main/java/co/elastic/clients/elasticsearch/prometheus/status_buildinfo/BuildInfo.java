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

package co.elastic.clients.elasticsearch.prometheus.status_buildinfo;

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

// typedef: prometheus.status_buildinfo.BuildInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#prometheus.status_buildinfo.BuildInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class BuildInfo implements JsonpSerializable {
	private final String application;

	private final String version;

	private final String revision;

	private final DateTime builddate;

	// ---------------------------------------------------------------------------------------------

	private BuildInfo(Builder builder) {

		this.application = ApiTypeHelper.requireNonNull(builder.application, this, "application");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.revision = ApiTypeHelper.requireNonNull(builder.revision, this, "revision");
		this.builddate = ApiTypeHelper.requireNonNull(builder.builddate, this, "builddate");

	}

	public static BuildInfo of(Function<Builder, ObjectBuilder<BuildInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the application. It is always
	 * <code>Elasticsearch</code>.
	 * <p>
	 * API name: {@code application}
	 */
	public final String application() {
		return this.application;
	}

	/**
	 * Required - The Elasticsearch version.
	 * <p>
	 * API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * Required - The commit hash of the Elasticsearch build.
	 * <p>
	 * API name: {@code revision}
	 */
	public final String revision() {
		return this.revision;
	}

	/**
	 * Required - The date of the Elasticsearch build.
	 * <p>
	 * API name: {@code buildDate}
	 */
	public final DateTime builddate() {
		return this.builddate;
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

		generator.writeKey("application");
		generator.write(this.application);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("revision");
		generator.write(this.revision);

		generator.writeKey("buildDate");
		this.builddate.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BuildInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BuildInfo> {
		private String application;

		private String version;

		private String revision;

		private DateTime builddate;

		public Builder() {
		}
		private Builder(BuildInfo instance) {
			this.application = instance.application;
			this.version = instance.version;
			this.revision = instance.revision;
			this.builddate = instance.builddate;

		}
		/**
		 * Required - The name of the application. It is always
		 * <code>Elasticsearch</code>.
		 * <p>
		 * API name: {@code application}
		 */
		public final Builder application(String value) {
			this.application = value;
			return this;
		}

		/**
		 * Required - The Elasticsearch version.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - The commit hash of the Elasticsearch build.
		 * <p>
		 * API name: {@code revision}
		 */
		public final Builder revision(String value) {
			this.revision = value;
			return this;
		}

		/**
		 * Required - The date of the Elasticsearch build.
		 * <p>
		 * API name: {@code buildDate}
		 */
		public final Builder builddate(DateTime value) {
			this.builddate = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BuildInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BuildInfo build() {
			_checkSingleUse();

			return new BuildInfo(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BuildInfo}
	 */
	public static final JsonpDeserializer<BuildInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BuildInfo::setupBuildInfoDeserializer);

	protected static void setupBuildInfoDeserializer(ObjectDeserializer<BuildInfo.Builder> op) {

		op.add(Builder::application, JsonpDeserializer.stringDeserializer(), "application");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::revision, JsonpDeserializer.stringDeserializer(), "revision");
		op.add(Builder::builddate, DateTime._DESERIALIZER, "buildDate");

	}

}
