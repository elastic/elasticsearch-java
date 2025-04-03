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

package co.elastic.clients.elasticsearch.slm;

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

// typedef: slm._types.Invocation

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm._types.Invocation">API
 *      specification</a>
 */
@JsonpDeserializable
public class Invocation implements JsonpSerializable {
	private final String snapshotName;

	private final DateTime time;

	// ---------------------------------------------------------------------------------------------

	private Invocation(Builder builder) {

		this.snapshotName = ApiTypeHelper.requireNonNull(builder.snapshotName, this, "snapshotName");
		this.time = ApiTypeHelper.requireNonNull(builder.time, this, "time");

	}

	public static Invocation of(Function<Builder, ObjectBuilder<Invocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code snapshot_name}
	 */
	public final String snapshotName() {
		return this.snapshotName;
	}

	/**
	 * Required - API name: {@code time}
	 */
	public final DateTime time() {
		return this.time;
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

		generator.writeKey("snapshot_name");
		generator.write(this.snapshotName);

		generator.writeKey("time");
		this.time.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Invocation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Invocation> {
		private String snapshotName;

		private DateTime time;

		/**
		 * Required - API name: {@code snapshot_name}
		 */
		public final Builder snapshotName(String value) {
			this.snapshotName = value;
			return this;
		}

		/**
		 * Required - API name: {@code time}
		 */
		public final Builder time(DateTime value) {
			this.time = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Invocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Invocation build() {
			_checkSingleUse();

			return new Invocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Invocation}
	 */
	public static final JsonpDeserializer<Invocation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Invocation::setupInvocationDeserializer);

	protected static void setupInvocationDeserializer(ObjectDeserializer<Invocation.Builder> op) {

		op.add(Builder::snapshotName, JsonpDeserializer.stringDeserializer(), "snapshot_name");
		op.add(Builder::time, DateTime._DESERIALIZER, "time");

	}

}
