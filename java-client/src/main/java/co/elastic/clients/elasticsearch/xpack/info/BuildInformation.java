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

package co.elastic.clients.elasticsearch.xpack.info;

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

// typedef: xpack.info.BuildInformation

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.info.BuildInformation">API
 *      specification</a>
 */
@JsonpDeserializable
public class BuildInformation implements JsonpSerializable {
	private final DateTime date;

	private final String hash;

	// ---------------------------------------------------------------------------------------------

	private BuildInformation(Builder builder) {

		this.date = ApiTypeHelper.requireNonNull(builder.date, this, "date");
		this.hash = ApiTypeHelper.requireNonNull(builder.hash, this, "hash");

	}

	public static BuildInformation of(Function<Builder, ObjectBuilder<BuildInformation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code date}
	 */
	public final DateTime date() {
		return this.date;
	}

	/**
	 * Required - API name: {@code hash}
	 */
	public final String hash() {
		return this.hash;
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

		generator.writeKey("date");
		this.date.serialize(generator, mapper);
		generator.writeKey("hash");
		generator.write(this.hash);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BuildInformation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BuildInformation> {
		private DateTime date;

		private String hash;

		/**
		 * Required - API name: {@code date}
		 */
		public final Builder date(DateTime value) {
			this.date = value;
			return this;
		}

		/**
		 * Required - API name: {@code hash}
		 */
		public final Builder hash(String value) {
			this.hash = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BuildInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BuildInformation build() {
			_checkSingleUse();

			return new BuildInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BuildInformation}
	 */
	public static final JsonpDeserializer<BuildInformation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BuildInformation::setupBuildInformationDeserializer);

	protected static void setupBuildInformationDeserializer(ObjectDeserializer<BuildInformation.Builder> op) {

		op.add(Builder::date, DateTime._DESERIALIZER, "date");
		op.add(Builder::hash, JsonpDeserializer.stringDeserializer(), "hash");

	}

}
